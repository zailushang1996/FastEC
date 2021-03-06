package com.exaccu.fastec;

import android.annotation.SuppressLint;
import android.app.Application;

import com.exaccu.latte.ec.icon.FontEcModule;
import com.exaccu.latte_core.app.Latte;
import com.exaccu.latte_core.net.interceptor.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

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
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withLoaderDelayed(1000)
                .withApiHost("http://127.0.0.1")
                .withInterceptor(new DebugInterceptor("index",R.raw.test))
                .configure();

    }


}
