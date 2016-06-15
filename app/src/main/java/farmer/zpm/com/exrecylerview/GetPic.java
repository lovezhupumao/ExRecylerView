package farmer.zpm.com.exrecylerview;



import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public interface GetPic {
    @Headers("apikey:2f654b3b9212b440b4ab946cd989d4dd")
    @GET("meinv")
    Observable<PicBean> getPic(@Query("num") String num);
}
