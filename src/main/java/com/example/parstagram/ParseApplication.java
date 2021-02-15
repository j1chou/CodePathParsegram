package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VU2cLdLFdK3x6LpP0gjctCfIvRBA9B3J47oOvzLg")
                .clientKey("PatG2ddflvepEo5yvd7Lgwlm0MWTQvrZFsfFlaQs")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
