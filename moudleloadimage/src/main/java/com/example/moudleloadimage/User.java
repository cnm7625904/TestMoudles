package com.example.moudleloadimage;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Administrator on 2017/11/3.
 */

public class User {
    private final String firstName;     // 必传参数
    private final Context context;
    private final String lastName;      // 必传参数
    private final int age;              // 可选参数
    private final String phone;         // 可选参数
    private final String address;       // 可选参数
    private final String url;
    private final ImageView img;
    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.context=builder.context;
        this.url=builder.url;
        this.img=builder.img;
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .priority(Priority.HIGH)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide.with(context).load(url).apply(options).into(img);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getUrl() {
        return url;
    }
    public ImageView getImg() {
        return img;
    }
    public String getLastName() {
        return lastName;
    }
    public Context getContext() {
        return context;
    }
    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private final Context context;
        private int age;
        private String phone;
        private String address;
        private String url;
        private ImageView img;

        public UserBuilder(String firstName, String lastName,Context context) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.context=context;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
          }
        public UserBuilder img(ImageView img) {
            this.img = img;
            return this;
        }
        public UserBuilder url(String url) {
            this.url = url;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
