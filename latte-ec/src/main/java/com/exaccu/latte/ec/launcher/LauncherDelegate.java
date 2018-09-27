package com.exaccu.latte.ec.launcher;

import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;


import com.exaccu.latte.ec.R;
import com.exaccu.latte_core.delegates.LatteDelegate;
import com.exaccu.latte_core.util.storage.LattePreference;
import com.exaccu.latte_core.util.timer.BaseTimerTask;
import com.exaccu.latte_core.util.timer.ITimerListener;

import java.text.MessageFormat;
import java.util.Timer;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by 傅令杰 on 2017/4/22
 */

public class LauncherDelegate extends LatteDelegate implements ITimerListener {


    @Override
    public Object setLayout() {
        return null;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }

    @Override
    public void onTimer() {

    }
}
