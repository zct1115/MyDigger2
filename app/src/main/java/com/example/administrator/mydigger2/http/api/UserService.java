package com.example.administrator.mydigger2.http.api;

import com.google.gson.JsonObject;

import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2017/11/27.
 */

public interface UserService {

    @POST("login")
    Observable<String> login(@Path("username") String username,@Path("password") String password);
}
