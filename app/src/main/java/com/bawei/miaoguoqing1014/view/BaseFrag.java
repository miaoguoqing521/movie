package com.bawei.miaoguoqing1014.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * 作者： 姓名
 * 日期： 2019/10/14 08:52
 */
public abstract class BaseFrag extends Fragment {
    private boolean isVisible;
    //Basefragment懒加载

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        isVisible=true;
        loader();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        loader();
    }

    protected void loader() {
        if (getUserVisibleHint()&&isVisible){
            initDate();
        }else {
            Log.i("M","不加载");
        }

    }

    protected abstract void initDate();

}
