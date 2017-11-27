package com.example.administrator.mydigger2.di.component;

import android.app.Application;

import com.example.administrator.mydigger2.di.module.ApiModule;
import com.example.administrator.mydigger2.di.module.AppModule;
import com.example.administrator.mydigger2.di.module.HttpModule;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/11/27.
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class, HttpModule.class})
public interface AppComponent {
    Application application();


    Gson gson();
}
