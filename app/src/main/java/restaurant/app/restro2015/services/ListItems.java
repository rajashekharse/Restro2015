package restaurant.app.restro2015.services;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

import restaurant.app.restro2015.ItemsListView;
import restaurant.app.restro2015.entities.Item;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class ListItems extends AsyncTask<Void, Void, Void> {

    // The base URL for every Connect API request
    private final String _connectHost = "https://connect.squareup.com";
    ProgressDialog pdLoading;
    private ItemsListView.ItemsDrawer mItemsDrawer;
    private List<Item> items = null;
    public ListItems(Context context, ItemsListView.ItemsDrawer aItemsDrawer) {
        //pdLoading = new ProgressDialog(context);
        mItemsDrawer = aItemsDrawer;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        //this method will be running on UI thread
        //pdLoading.setMessage("\tLoading...");
        //pdLoading.show();
    }

    @Override
    protected Void doInBackground(Void... params) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(_connectHost)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Create an instance of our GitHub API interface.
        SquareUpService squareUpService = retrofit.create(SquareUpService.class);

        // Create a call instance for looking up Retrofit contributors.
        Call<List<Item>> call = squareUpService.listItems();

        try {
            // Fetch and print a list of the contributors to the library.
            items = call.execute().body();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        //this method will be running on UI thread
        mItemsDrawer.drawItemsList(items);
        //pdLoading.dismiss();
    }
}