package com.example.administrator.mydigger2.app;

import android.app.Application;

import com.example.administrator.mydigger2.di.component.AppComponent;

/**
 * Created by Administrator on 2017/11/27.
 */

public class App extends Application {
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();


    }
}
