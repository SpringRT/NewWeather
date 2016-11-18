package com.a11.weather;


import android.app.Application;

import com.a11.weather.data.models.Weather;

public class MyApplication extends Application{

    public MyApplication(){
        super();
    }

    public static Weather currentWeather = null;
    public static boolean screenIsSet = false;
}
