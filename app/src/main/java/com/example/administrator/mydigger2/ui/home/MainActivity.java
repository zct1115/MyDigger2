package com.example.administrator.mydigger2.ui.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.administrator.mydigger2.R;
import com.example.administrator.mydigger2.base.mvp.BaseActivity;
import com.example.administrator.mydigger2.di.component.AppComponent;

/**
 * @author zct
 * Created by Administrator on 2017/11/27.
 */
public class MainActivity extends BaseActivity {


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    protected View initView() {
        return LayoutInflater.from(mContext).inflate(R.layout.activity_main, null, false);
    }

    @Override
    protected void initData() {

    }
}
