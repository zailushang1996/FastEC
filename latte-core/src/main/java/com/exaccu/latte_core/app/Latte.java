package com.exaccu.latte_core.app;

import android.content.Context;
import android.os.Handler;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.latte_core.app
 * Create by 17864 on 2018/9/22
 *
 * @ Description:
 */
public final class Latte {

    public static Configurator init(Context context) {
        getConfigurations().put(ConfigKeys.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Context getApplication() {
        return (Context) getConfigurations().get(ConfigKeys.APPLICATION_CONTEXT.name());
    }

    public static HashMap<String,Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();
    }



    public static void test(){
    }
}
