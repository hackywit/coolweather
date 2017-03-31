package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hackywit on 2017/3/31.
 */

public class Basic {
    @SerializedName("city") //这是一个注解标记符号,serialized是序列化的意思
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
