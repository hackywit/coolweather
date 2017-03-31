package android.coolweather.com.coolweather.gson;

/**
 * Created by RD0016 on 2017/3/31.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
