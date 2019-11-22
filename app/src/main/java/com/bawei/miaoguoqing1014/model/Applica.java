package com.bawei.miaoguoqing1014.model;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 作者： 姓名
 * 日期： 2019/10/14 09:23
 */
public class Applica extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
