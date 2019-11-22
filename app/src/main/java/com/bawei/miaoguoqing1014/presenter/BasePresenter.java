package com.bawei.miaoguoqing1014.presenter;

import com.bawei.miaoguoqing1014.view.IBaseView;

/**
 * 作者： 姓名
 * 日期： 2019/10/14 10:06
 */
public class BasePresenter<T extends IBaseView> {
    public T t;

    public void dettach(){
        t=null;
    }
}
