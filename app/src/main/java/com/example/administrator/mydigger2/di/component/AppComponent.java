package com.example.administrator.mydigger2.di.component;

import android.app.Application;

import com.example.administrator.mydigger2.di.module.ApiModule;
import com.example.administrator.mydigger2.di.module.AppModule;
import com.example.administrator.mydigger2.di.module.HttpModule;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author zct
 *         Created by Administrator on 2017/11/27.
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class, HttpModule.class})
public interface AppComponent {
    /**
     * app应用
     *
     * @return
     */
    Application application();


    /**
     * gson
     *
     * @return
     */
    Gson gson();
}
