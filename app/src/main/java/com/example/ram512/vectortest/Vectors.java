package com.example.ram512.vectortest;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

public class Vectors extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
