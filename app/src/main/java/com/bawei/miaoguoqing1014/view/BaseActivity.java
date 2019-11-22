package com.bawei.miaoguoqing1014.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.miaoguoqing1014.R;

/**
 * 作者： 姓名
 * 日期： 2019/10/14 10:04
 */
public abstract class BaseActivity extends AppCompatActivity {
    //抽基类
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initDate());
        initView();
    }
    abstract int initDate();
    abstract void initView();

}
