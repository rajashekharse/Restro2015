package restaurant.app.restro2015;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

import restaurant.app.restro2015.adapters.CategoriesListViewAdapter;
import restaurant.app.restro2015.adapters.ItemsListViewAdapter;
import restaurant.app.restro2015.entities.Category;
import restaurant.app.restro2015.entities.Item;
import restaurant.app.restro2015.entities.ItemVariation;
import restaurant.app.restro2015.utils.DownloadImageTask;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    ViewFlipper mSwitcher;
    CategoriesListView mCategoriesListView;
    ItemsListView itemsListView;
    GridView mGridView;
    ItemsListViewAdapter itemsListAdapter;
    List<Item> filteredList;

    public List<Item> filterItems(List<Item> items, Category category){
        List<Item> filteredItems = new ArrayList<Item>();
        for(int i=0; i < items.size(); i++) {
            if(items.get(i).getCategory().getName().equalsIgnoreCase(category.getName())) {
                filteredItems.add(items.get(i));
            }
        }
        return filteredItems;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwitcher = (ViewFlipper) findViewById(R.id.ViewFlipper);
        mListView = (ListView) findViewById(R.id.categoriesListView);
        mGridView = (GridView) findViewById(R.id.itemsListView);
        mCategoriesListView = new CategoriesListView(mListView, MainActivity.this);
        mGridView.setTextFilterEnabled(true);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category selectedItem = mCategoriesListView.getmCategories().get(position);
                filteredList = filterItems(itemsListView.getmItems(), selectedItem);
                mGridView.setAdapter(new ItemsListViewAdapter(MainActivity.this, mListView.getId() ,filteredList));
                //itemsListAdapter.getFilter().filter(selectedItem.getName());
                new AnimationUtils();
                mSwitcher.setAnimation(AnimationUtils.makeInAnimation
                        (getBaseContext(), true));
                mSwitcher.showNext();
            }
        });

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                loadItemContent(filteredList.get(position));
                new AnimationUtils();
                mSwitcher.setAnimation(AnimationUtils.makeInAnimation
                        (getBaseContext(), true));
                mSwitcher.showNext();
            }
        });
        itemsListAdapter = new ItemsListViewAdapter(MainActivity.this, mListView.getId(),null);
        itemsListView = new ItemsListView(mGridView, MainActivity.this, itemsListAdapter);

    }

    private void loadItemContent(Item item) {
        new DownloadImageTask((ImageView) findViewById(R.id.imageView)).execute(item.getMaster_image().getUrl());
        ((TextView) findViewById(R.id.textView)).setText(item.getName());
        //((TextView) findViewById(R.id.price)).setText(item.getVariations()[0].getPrice_money().getCurrency_code() + " " +item.getVariations()[0].getPrice_money().getAmount() );
        ((TextView) findViewById(R.id.description)).setText(item.getDescription());
        ((LinearLayout) findViewById(R.id.itemDetailsContainer)).setBackgroundColor(Color.parseColor("#" + item.getColor()));
        ((LinearLayout) findViewById(R.id.header)).setBackgroundColor(Color.parseColor("#" + item.getColor()));
        LinearLayout itemVariationsContainer = (LinearLayout) findViewById(R.id.itemVariationsContainer);
        itemVariationsContainer.removeAllViews();
        for(int i = 0; i < item.getVariations().length; i++) {
            ItemVariation variation = item.getVariations()[i];
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.item_variation, itemVariationsContainer,false);
            ((ImageView) view.findViewById(R.id.addIconButton)).setBackgroundColor(Color.parseColor("#" + item.getColor()));
            ((TextView) view.findViewById(R.id.textView2)).setText(variation.getName());
            String price = variation.getPrice_money().getCurrency_code()+" "+(variation.getPrice_money().getAmount().intValue()/100);
            if (price != null) {
                ((TextView) view.findViewById(R.id.textView3)).setText(price);
            }
            itemVariationsContainer.addView(view);
        }
    }

    @Override
    public void onBackPressed() {
        new AnimationUtils();
        mSwitcher.setAnimation(AnimationUtils.makeInAnimation
                (getBaseContext(), true));
        mSwitcher.showPrevious();
    }
}
