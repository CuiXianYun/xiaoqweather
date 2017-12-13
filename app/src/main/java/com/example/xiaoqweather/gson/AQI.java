package com.example.xiaoqweather.gson;

/**
 * Created by Tracy on 2017/12/12.
 */

public class AQI {
    /**
     * aqi
         city
             aqi	"17"
             qlty	"优"
             pm25	"5"
             pm10	"17"
             no2	"18"
             so2	"2"
             co	"0"
             o3	"45"
     */

    public AQICity city;

    public class AQICity{

        public String aqi;
        public String pm25;
    }

}
