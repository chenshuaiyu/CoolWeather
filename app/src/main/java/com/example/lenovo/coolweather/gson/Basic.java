package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Coder : chenshuaiyu
 * Time : 2018/1/31 19:28
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
