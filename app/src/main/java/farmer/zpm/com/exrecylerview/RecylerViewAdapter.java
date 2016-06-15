package farmer.zpm.com.exrecylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public class RecylerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<PicBean.NewslistBean> mlist;
//private List<String> mlist;
    private static final int NORMAL_ITEM = 0;
    private static final int GROUP_ITEM = 1;
    private LayoutInflater mLayoutInflater;
    public RecylerViewAdapter(Context context ,List<PicBean.NewslistBean> list) {
        this.mContext=context;
        this.mlist=list;
//        mlist=new ArrayList<String>();

        mLayoutInflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == NORMAL_ITEM) {
            return new NormalItemHolder(mLayoutInflater.inflate(R.layout.fragment_base_swipe_list, parent, false));
        } else {
            return new GroupItemHolder(mLayoutInflater.inflate(R.layout.fragment_base_swipe_group_item, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        PicBean.NewslistBean newslistBean=mlist.get(position);
//        PicBean.NewslistBean newslistBean=new PicBean.NewslistBean();
//        newslistBean.setPicUrl(mlist.get(position));
        if (newslistBean==null)return;
        if (holder instanceof NormalItemHolder){
            NormalItemHolder nholder = (NormalItemHolder) holder;
            bindNormalItem(newslistBean, nholder.newsTitle, nholder.newsIcon);
        }
        else {
            bindGroupItem(newslistBean, (GroupItemHolder) holder);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    private void bindGroupItem(PicBean.NewslistBean newslistBean, GroupItemHolder holder) {
        bindNormalItem(newslistBean, holder.newsTitle, holder.newsIcon);
        holder.newsTime.setText(newslistBean.getDescription());
    }

    private void bindNormalItem(PicBean.NewslistBean newslistBean, TextView newsTitle, ImageView newsIcon) {

        newsTitle.setText(newslistBean.getTitle());
        Picasso.with(mContext).load(newslistBean.getPicUrl()).into(newsIcon);
    }


    @Override
    public int getItemCount() {
        return mlist.size();
    }
//    public void addList(String str){mlist.add(str);notifyItemInserted(mlist.size());}
}
