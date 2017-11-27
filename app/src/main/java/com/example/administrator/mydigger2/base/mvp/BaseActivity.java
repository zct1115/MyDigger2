package com.example.administrator.mydigger2.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.mydigger2.app.App;
import com.example.administrator.mydigger2.di.component.AppComponent;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/11/27.
 */

public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity {

    protected App mApplication;
    private Unbinder mUnbinder;
    @Inject
    protected P mPresenter;
    protected Context mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplication = (App) getApplication();
        mContext = this;

        setContentView(initView());
        mUnbinder = ButterKnife.bind(this);

        setupActivityComponent(mApplication.getAppComponent());
        initData();

    }

    /**
     * 依赖注入的入口
     */
    protected abstract void setupActivityComponent(AppComponent appComponent);


    protected abstract View initView();

    protected abstract void initData();
}
