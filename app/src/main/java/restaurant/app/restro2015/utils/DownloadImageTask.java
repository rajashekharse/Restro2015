package restaurant.app.restro2015.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.InputStream;

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    ImageView bmImage;
    RelativeLayout layout;
    Context mContext;

    public DownloadImageTask(ImageView bmImage) {
        this.bmImage = bmImage;
    }

    public DownloadImageTask(RelativeLayout layout, Context context) {
        this.layout = layout;
        this.mContext = context;
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mIcon11;
    }


/*    @Override
    protected void onPreExecute() {
        // TODO Auto-generated method stub
        super.onPreExecute();
        showProgressDialog();
    }*/

    protected void onPostExecute(Bitmap result) {
        //pDlg.dismiss();
        if(bmImage != null) {
            bmImage.setImageBitmap(result);
        }
        if(layout != null) {
            BitmapDrawable ob = new BitmapDrawable(mContext.getResources(), result);
            layout.setBackgroundDrawable(ob);
        }
    }}