package restaurant.app.restro2015.services;

import java.util.List;

import restaurant.app.restro2015.entities.Category;
import restaurant.app.restro2015.entities.Item;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * Created by DELL PC on 07-11-2015.
 */
public interface SquareUpService {
    final String  _accessToken= "mXgKKqCC2YY-2kG7SfY7Hg";

    @Headers("Authorization: Bearer "+ _accessToken)
    @GET("/v1/me/categories")
    Call<List<Category>> listCategories();

    @Headers("Authorization: Bearer "+ _accessToken)
    @GET("/v1/me/items")
    Call<List<Item>> listItems();
}
