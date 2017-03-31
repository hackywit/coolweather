package android.coolweather.com.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.coolweather.com.coolweather.gson.Weather;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather",null) != null){
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);//这边如果没有启动新的活动就finish就会直接关闭主活动推出程序，类似闪退，但和闪退不是一个概念
//            finish();//最好不要直接关闭，让用户可以返回去直接选择
        }
    }
}
