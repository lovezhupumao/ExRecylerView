package farmer.zpm.com.exrecylerview;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public class GroupItemHolder extends  NormalItemHolder {
    TextView newsTime;
    public GroupItemHolder(View itemView) {
        super(itemView);
        newsTime = (TextView) itemView.findViewById(R.id.base_swipe_group_item_time);
    }
}
