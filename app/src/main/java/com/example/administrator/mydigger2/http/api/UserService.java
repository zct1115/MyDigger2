package com.example.administrator.mydigger2.http.api;

import com.google.gson.JsonObject;

import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author zct
 * Created by Administrator on 2017/11/27.
 */

public interface UserService {

    /**
     *
     * 登录接口
     * @param username  用户名
     * @param password  密码
     * @return
     */
    @POST("login")
    Observable<String> login(@Path("username") String username,@Path("password") String password);
}
