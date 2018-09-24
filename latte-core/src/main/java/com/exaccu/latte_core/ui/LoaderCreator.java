package com.exaccu.latte_core.ui;

import android.content.Context;

import com.wang.avi.AVLoadingIndicatorView;
import com.wang.avi.Indicator;

import java.util.WeakHashMap;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.latte_core.ui
 * Create by 17864 on 2018/9/24
 *
 * @ Description:
 */
public final class LoaderCreator {
    private static final WeakHashMap<String, Indicator> LOADING_MAP = new WeakHashMap<>();

    static AVLoadingIndicatorView create(String type, Context context) {
        final AVLoadingIndicatorView avLoadingIndicatorView = new AVLoadingIndicatorView(context);
        if (LOADING_MAP.get(type) == null) {
            final Indicator indicator = getIndicator(type);
            LOADING_MAP.put(type, indicator);
        }

        avLoadingIndicatorView.setIndicator(LOADING_MAP.get(type));
        return avLoadingIndicatorView;

    }

    private static Indicator getIndicator(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        final StringBuilder drawableClassName = new StringBuilder();
        if (!name.contains(".")) {
            final String defaultPackageName = AVLoadingIndicatorView.class.getPackage().getName();
            drawableClassName.append(defaultPackageName)
                    .append(".indicators")
                    .append(".");
        }
        drawableClassName.append(name);
        try {
            final Class<?> drawableClass = Class.forName(drawableClassName.toString());
            return (Indicator) drawableClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
