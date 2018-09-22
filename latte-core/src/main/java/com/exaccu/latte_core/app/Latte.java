package com.exaccu.latte_core.app;

import android.content.Context;

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
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigus();
    }
}
