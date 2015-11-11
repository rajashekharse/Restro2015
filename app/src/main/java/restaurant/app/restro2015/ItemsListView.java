package restaurant.app.restro2015;

import android.content.Context;
import android.widget.GridView;
import android.widget.ListView;

import java.util.List;

import restaurant.app.restro2015.adapters.CategoriesListViewAdapter;
import restaurant.app.restro2015.adapters.ItemsListViewAdapter;
import restaurant.app.restro2015.entities.Category;
import restaurant.app.restro2015.entities.Item;
import restaurant.app.restro2015.services.ListCategories;
import restaurant.app.restro2015.services.ListItems;

/**
 * Created by rajashekhar on 09/11/15.
 */
public class ItemsListView {

    public List<Item> mItems;
    public GridView mListView;
    public Context mContext;
    public ItemsListViewAdapter mItemsListViewAdapter;

    public List<Item> getmItems() {
        return mItems;
    }

    public void setmItems(List<Item> mItems) {
        this.mItems = mItems;
    }

    public ItemsListView(GridView listView, Context aContext,ItemsListViewAdapter itemsListViewAdapter ) {
        mListView = listView;
        mContext = aContext;
        mItemsListViewAdapter = itemsListViewAdapter;
        new ListItems(mContext, new ItemsDrawer()).execute();
    }

    public class ItemsDrawer {
        public void drawItemsList(List<Item> result) {
            try{
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mItems = result;
            mItemsListViewAdapter.setmItemsList(mItems);
            mListView.setAdapter(mItemsListViewAdapter);
        }
    }
}
