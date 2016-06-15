package farmer.zpm.com.exrecylerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public class NormalItemHolder extends RecyclerView.ViewHolder {
    TextView newsTitle;
    ImageView newsIcon;
    public NormalItemHolder(View itemView) {
        super(itemView);
        newsTitle = (TextView) itemView.findViewById(R.id.base_swipe_item_title);
        newsIcon = (ImageView) itemView.findViewById(R.id.base_swipe_item_icon);
        itemView.findViewById(R.id.base_swipe_item_container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
