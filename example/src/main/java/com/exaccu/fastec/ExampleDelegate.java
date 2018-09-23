package com.exaccu.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.exaccu.latte_core.delegates.LatteDelegate;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.fastec
 * Create by 17864 on 2018/9/23
 *
 * @ Description:
 */
public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
