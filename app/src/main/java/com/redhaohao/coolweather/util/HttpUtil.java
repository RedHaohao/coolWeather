package com.redhaohao.coolweather.util;


import okhttp3.*;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback)
    {
        OkHttpClient client =new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
