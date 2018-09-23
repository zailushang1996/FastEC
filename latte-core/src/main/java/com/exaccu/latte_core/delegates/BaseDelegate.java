package com.exaccu.latte_core.delegates;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.latte_core.delegates
 * Create by 17864 on 2018/9/23
 *
 * @ Description:
 */
public abstract class BaseDelegate extends SwipeBackFragment{

    public abstract Object setLayout();

    private Unbinder mUnbinder = null;

    public abstract void onBindView(@Nullable Bundle savedInstanceState, View rootView);
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = null;
        if (setLayout() instanceof Integer) {
            rootView = inflater.inflate((Integer) setLayout(), container, false);
        } else if (setLayout() instanceof View) {
            rootView =(View) setLayout();

        }

        if (rootView != null) {
            mUnbinder = ButterKnife.bind(this, rootView);
        }
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }
}
