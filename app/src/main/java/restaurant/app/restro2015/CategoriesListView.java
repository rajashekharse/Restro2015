package restaurant.app.restro2015;

import android.content.Context;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import restaurant.app.restro2015.adapters.CategoriesListViewAdapter;
import restaurant.app.restro2015.entities.Category;
import restaurant.app.restro2015.services.ListCategories;

/**
 * Created by rajashekhar on 09/11/15.
 */
public class CategoriesListView {

    public List<Category> mCategories;
    public ListView mListView;
    public Context mContext;

    public CategoriesListView(ListView listView, Context aContext) {
        mListView = listView;
        mContext = aContext;
        new ListCategories(mContext, new CategoriesDrawer()).execute();
    }

    public List<Category> getmCategories() {
        return mCategories;
    }

    public void setmCategories(List<Category> mCategories) {
        this.mCategories = mCategories;
    }

    public class CategoriesDrawer {
        public void drawCategoriesList(List<Category> result) {
            try{
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mCategories = result;
            mListView.setAdapter(new CategoriesListViewAdapter(mContext, mCategories));
        }
    }
}
