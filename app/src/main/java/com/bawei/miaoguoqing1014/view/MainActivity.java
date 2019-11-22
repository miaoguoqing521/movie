package com.bawei.miaoguoqing1014.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.miaoguoqing1014.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity{

    private ViewPager view;
    private TabLayout tab;



    @Override
    int initDate() {
        return R.layout.activity_main;
    }

    @Override
    void initView() {

        view = findViewById(R.id.view);
        tab = findViewById(R.id.tab);
        List<String> list=new ArrayList<>();
        list.add("我的");
        list.add("他的");
        List<Fragment> fragmentList=new ArrayList<>();
        fragmentList.add(new MyFrag());
        fragmentList.add(new HomeFrag());
        //适配器
        MyAdapter myAdapter=new MyAdapter(getSupportFragmentManager(),list,fragmentList);
        view.setAdapter(myAdapter);
        tab.setupWithViewPager(view);
    }

    }

