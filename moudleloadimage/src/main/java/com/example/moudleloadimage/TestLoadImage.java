package com.example.moudleloadimage;

import android.content.Context;
import android.support.annotation.MainThread;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Administrator on 2017/11/2.
 */

public class TestLoadImage {
    public static void sayHello(){
        Log.e("haha","Mulity");
    }
    public static void loadSimpleImage(Context context, String url, ImageView img)
    {
        RequestOptions options = new RequestOptions()
                .centerCrop()
//                .error(R.mipmapap.zwt)
//                .placeholder(R.mipmap.zwt)
                .priority(Priority.HIGH)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide
                .with(context)
                .load(url)
                .thumbnail(0.1f)
                .transition(DrawableTransitionOptions.withCrossFade())
                .apply(options)
                .into(img);


    }
}
