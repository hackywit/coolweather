package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hackywit on 2017/3/31.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")//这边我少写了一个e，导致隐射没有建立，也就是根本没有forecastList对象，所以遍历查找的时候出现找不到对象，就闪退了
    public List<Forecast> forecastList;
}
