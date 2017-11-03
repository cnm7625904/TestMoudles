package com.example.administrator.testmoudles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.moudleloadimage.TestLoadImage;
import com.example.moudleloadimage.User;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
//        TestLoadImage.loadSimpleImage(MainActivity.this,
//                "http://7xi8d6.com1.z0.glb.clouddn.com/20171101141835_yQYTXc_enakorin_1_11_2017_14_16_45_351.jpeg",
//                img);
//        User.UserBuilder userBuilder=new User.UserBuilder("asd","adas");
//        userBuilder.address("123").
//                build();
//        User user=new User(userBuilder);
//
//        Log.e("haha",user.getAddress());
//        User.UserBuilder userBuilders=new User.UserBuilder("","");
//        userBuilders.address("3333333333").
//                build();
        User.UserBuilder userBuilder=new User.UserBuilder("","",MainActivity.this);
        userBuilder
                .url("http://7xi8d6.com1.z0.glb.clouddn.com/20171101141835_yQYTXc_enakorin_1_11_2017_14_16_45_351.jpeg")
                .img(img)
                .build();
//        User user=new User(userBuilder);

    }
}
