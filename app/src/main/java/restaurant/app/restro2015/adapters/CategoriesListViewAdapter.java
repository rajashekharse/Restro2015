package restaurant.app.restro2015.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import restaurant.app.restro2015.R;
import restaurant.app.restro2015.entities.Category;
import restaurant.app.restro2015.utils.CoreUtils;

/**
 * Created by rajashekhar on 09/11/15.
 */
public class CategoriesListViewAdapter extends BaseAdapter{
    List<Category> mCategoriesList;
    Context mContext;

    public CategoriesListViewAdapter(Context aContext,List<Category> aCategoriesList) {
        mContext = aContext;
        mCategoriesList = aCategoriesList;
    }



    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mCategoriesList.size();
    }

    @Override
    public Category getItem(int arg0) {
        // TODO Auto-generated method stub
        return mCategoriesList.get(arg0);
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
            arg1 = inflater.inflate(R.layout.category_list_item, arg2,false);
        }
        Category category = mCategoriesList.get(arg0);

        RelativeLayout textViewContainer = (RelativeLayout) arg1.findViewById(R.id.textViewContainer);

        try {
            int resourceId = CoreUtils.getDrawable(mContext, category.getName().toLowerCase());
            if(resourceId > 0) {
                textViewContainer.setBackgroundResource(resourceId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView chapterName = (TextView)arg1.findViewById(R.id.textView1);

        chapterName.setText(category.getName());
        return arg1;
    }


 }
