package com.exaccu.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.exaccu.latte_core.delegates.LatteDelegate;
import com.exaccu.latte_core.net.RestClient;
import com.exaccu.latte_core.net.callback.IError;
import com.exaccu.latte_core.net.callback.IFailure;
import com.exaccu.latte_core.net.callback.ISuccess;

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
        testRestClient();
    }


    private void testRestClient() {
        RestClient.builder()
                .url("http://127.0.0.1/")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getContext(), response, Toast.LENGTH_LONG).show();
                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build()
        .download();

    }
}
