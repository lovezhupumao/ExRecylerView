package farmer.zpm.com.exrecylerview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecylerViewAdapter mrecyleradapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.myrecyclerview);
//        mrecyleradapter=new RecylerViewAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        // 设置ItemAnimator
                        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                        // 设置固定大小
                        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mrecyleradapter);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://apis.baidu.com/txapi/mvtp/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        final GetPic pic = retrofit.create(GetPic.class);
        pic.getPic("8")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<PicBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(PicBean picBean) {
                        System.out.println("onNext");
                        mrecyleradapter=new RecylerViewAdapter(MainActivity.this,picBean.getNewslist());
                        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                        // 设置ItemAnimator
                        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                        // 设置固定大小
                        mRecyclerView.setHasFixedSize(true);

                        // 为mRecyclerView设置适配器
                        mRecyclerView.setAdapter(mrecyleradapter);
                    }
                });
//        pic.getPic("8").flatMap(new Func1<PicBean, Observable<String>>() {
//            @Override
//            public Observable<String> call(PicBean picBean) {
//                String[] str=new String[picBean.getNewslist().size()];
//                for (int i=0;i<picBean.getNewslist().size();i++)
//                {
//                    str[i]=picBean.getNewslist().get(i).getPicUrl();
//                }
//                return Observable.from(str);
//            }
//        })
//                .subscribe(new Subscriber<String>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(String s) {
//                        mrecyleradapter.addList(s);
//
//                    }
//                });


    }
}
