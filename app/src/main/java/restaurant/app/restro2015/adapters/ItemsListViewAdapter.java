package restaurant.app.restro2015.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.net.URL;
import java.util.List;

import restaurant.app.restro2015.R;
import restaurant.app.restro2015.entities.Category;
import restaurant.app.restro2015.entities.Item;
import restaurant.app.restro2015.utils.CoreUtils;
import restaurant.app.restro2015.utils.DownloadImageTask;

/**
 * Created by rajashekhar on 09/11/15.
 */
public class ItemsListViewAdapter extends ArrayAdapter{
    List<Item> mItemsList;
    Context mContext;

    public ItemsListViewAdapter(Context context, int resource, List<Item> mItemsList) {
        super(context, resource);
        this.mItemsList = mItemsList;
        this.mContext = context;
    }

    public List<Item> getmItemsList() {
        return mItemsList;
    }

    public void setmItemsList(List<Item> mItemsList) {
        this.mItemsList = mItemsList;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mItemsList.size();
    }

    @Override
    public Item getItem(int arg0) {
        // TODO Auto-generated method stub
        return mItemsList.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {

        if(arg1==null)
        {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            arg1 = inflater.inflate(R.layout.list_item, arg2,false);
        }
        Item item = mItemsList.get(arg0);

        RelativeLayout layot = (RelativeLayout) arg1.findViewById(R.id.textViewContainer);
        if(item.getMaster_image() != null) {
            new DownloadImageTask(layot, mContext).execute(item.getMaster_image().getUrl());
        }

        LinearLayout textViewContainer = (LinearLayout) arg1.findViewById(R.id.linearLayout);
        if (item.getColor() != null) {
            textViewContainer.setBackgroundColor(Color.parseColor("#"+item.getColor()));
        }

        try {
            int resourceId = CoreUtils.getDrawable(mContext, item.getName().toLowerCase());
            if(resourceId > 0) {
                textViewContainer.setBackgroundResource(resourceId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView chapterName = (TextView)arg1.findViewById(R.id.textView1);

        chapterName.setText(item.getName());
        return arg1;
    }
 }
