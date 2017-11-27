package com.example.administrator.mydigger2.di.module;

import com.example.administrator.mydigger2.http.api.UserService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2017/11/27.
 */

@Module
public class ApiModule {

    @Singleton
    @Provides
    HttpUrl provideBaseUrl(){
        return HttpUrl.parse("http://192.168.1.1:8080/");
    }

    @Singleton
    @Provides
    UserService provideUserService(Retrofit retrofit) {
        return retrofit.create(UserService.class);
    }

}
