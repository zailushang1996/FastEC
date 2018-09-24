package com.exaccu.latte_core.net;

import android.content.Context;


import com.exaccu.latte_core.net.callback.IError;
import com.exaccu.latte_core.net.callback.IFailure;
import com.exaccu.latte_core.net.callback.IRequest;
import com.exaccu.latte_core.net.callback.ISuccess;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;



public final class RestClientBuilder {

    private  String mUrl;
    private static final Map<String, Object> PARAMS = RestCreator.getParams();
    private  IRequest mRequest;
    private  ISuccess mSuccess;
    private  IFailure mFailure;
    private  IError mError;
    private  RequestBody mBody;

    RestClientBuilder() {
    }

    public final RestClientBuilder url(String url) {
        this.mUrl = url;
        return this;
    }

    public final RestClientBuilder params(WeakHashMap<String, Object> params) {
        PARAMS.putAll(params);
        return this;
    }

    public final RestClientBuilder params(String key, Object value) {

       PARAMS.put(key, value);
        return this;
    }

    public final RestClientBuilder raw(String raw) {
        this.mBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), raw);
        return this;
    }

    public final RestClientBuilder success(ISuccess iSuccess) {
        this.mSuccess = iSuccess;
        return this;
    }

    public final RestClientBuilder onRequest(IRequest iRequest) {
        this.mRequest = iRequest;
        return this;
    }

    public final RestClientBuilder failure(IFailure iFailure) {
        this.mFailure = iFailure;
        return this;
    }

    public final RestClientBuilder error(IError iError) {
        this.mError = iError;
        return this;
    }



    public final RestClient build() {
        return new RestClient(mUrl, PARAMS, mRequest, mSuccess, mFailure, mError, mBody);
    }
}
