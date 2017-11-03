package com.example.moudleloadimage;

/**
 * Created by Administrator on 2017/11/3.
 */

public class AppGlide {
    private  String url;

    private AppGlide(userBuilder userBuilder){
        this.url=userBuilder.url;
    }
    public String getUrl(){
        return url;
    }
    public static class userBuilder{
        private String url;
        public userBuilder name(String url){
            this.url=url;
            return this;
        }
        public AppGlide build(){
            AppGlide appGlide =new AppGlide(this);
            return appGlide;
        }
    }

}
