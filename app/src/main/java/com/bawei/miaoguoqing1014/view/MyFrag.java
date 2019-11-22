package com.bawei.miaoguoqing1014.view;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.miaoguoqing1014.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.io.File;
import java.net.URI;
import java.net.URL;

/**
 * 作者： 姓名
 * 日期： 2019/10/14 08:58
 */
public class MyFrag extends BaseFrag{

    private SimpleDraweeView simple;
    //寻找控件
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.myfrag, container, false);
        simple = inflate.findViewById(R.id.simple);
        return inflate;
    }

    @Override
    protected void initDate() {
        Uri uri = Uri.parse("http://172.17.8.100/images/small/default/user.jpg");
        simple.setImageURI(uri);
    }
}
