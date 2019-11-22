package com.bawei.miaoguoqing1014.model;

import retrofit2.http.GET;
import rx.Observable;

/**
 * 作者： 姓名
 * 日期： 2019/10/14 09:42
 */
public interface Api {
    @GET("")
    Observable<Bean> tu();
}
