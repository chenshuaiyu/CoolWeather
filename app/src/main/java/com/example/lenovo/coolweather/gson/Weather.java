package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/1/31 19:43
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
