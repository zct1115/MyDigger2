package com.example.administrator.mydigger2.app;

import android.app.Application;

import com.example.administrator.mydigger2.di.component.AppComponent;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author zct
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
        Logger.addLogAdapter(new AndroidLogAdapter());

    }
}
