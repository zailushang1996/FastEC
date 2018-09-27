package com.exaccu.latte.ec.launcher;

import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;


import com.exaccu.latte.ec.R;
import com.exaccu.latte.ec.R2;
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

    @BindView(R2.id.tv_launcher_timer)
    AppCompatTextView mTvTimer = null;

    private Timer mTimer = null;
    private int mCount = 5;


    @OnClick(R2.id.tv_launcher_timer)
    void onClickTimerView() {
        if (mTimer != null) {

        }
    }

    private void initTimer() {
        mTimer = new Timer();
        final BaseTimerTask task = new BaseTimerTask(this);
        mTimer.schedule(task, 0, 1000);
    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        initTimer();
    }

    @Override
    public void onTimer() {
        getProxyActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mTvTimer != null) {
                    mTvTimer.setText(MessageFormat.format("跳过\n{0}s", mCount));
                    mCount--;
                    if (mCount < 0) {
                        if (mTimer != null) {
                            mTimer.cancel();
                            mTimer = null;
                        }
                    }
                }
            }
        });
    }

    @Override
    public void post(Runnable runnable) {

    }


}
