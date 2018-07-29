package com.example.atamuhiuldin.firebase01;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by AtaMuhiUlDin on 4/13/2018.
 */

public class MyApp extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();


        Firebase.setAndroidContext(this);


    }
}
