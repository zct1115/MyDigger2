package com.example.administrator.mydigger2.base.mvp;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/11/27.
 */

public class BasePresenter<M extends IModel,V extends IView> {
    @Inject
    protected M mModel;
    @Inject
    protected V mView;

    public BasePresenter() {
    }

    protected Context getContext(){
        return (Context) mView;
    }
}
