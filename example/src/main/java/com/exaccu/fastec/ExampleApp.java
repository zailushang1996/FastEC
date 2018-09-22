package com.exaccu.fastec;

import android.app.Application;

import com.exaccu.latte_core.app.Latte;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.fastec
 * Create by 17864 on 2018/9/22
 *
 * @ Description:
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this).withApiHost("http://127.0.0.1").configure();

    }


}
