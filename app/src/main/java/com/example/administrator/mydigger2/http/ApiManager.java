package com.example.administrator.mydigger2.http;

import com.example.administrator.mydigger2.http.api.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Administrator on 2017/11/27.
 */
@Singleton
public class ApiManager {
    @Inject
    public UserService muserService;

    @Inject
    public ApiManager() {
    }
}
