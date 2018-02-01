package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Coder : chenshuaiyu
 * Time : 2018/1/31 19:34
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
