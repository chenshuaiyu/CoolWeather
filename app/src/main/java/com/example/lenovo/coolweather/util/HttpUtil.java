package com.example.lenovo.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Coder : chenshuaiyu
 * Time : 2018/1/30 18:56
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
