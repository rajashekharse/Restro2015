package restaurant.app.restro2015.utils;

import android.content.Context;

import junit.framework.Assert;

/**
 * Created by DELL PC on 09-11-2015.
 */
public class CoreUtils {
    public static int getDrawable(Context context, String name)
    {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);

        return context.getResources().getIdentifier(name,
                "drawable", context.getPackageName());
    }
}
