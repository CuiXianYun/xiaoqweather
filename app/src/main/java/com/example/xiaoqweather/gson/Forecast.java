package com.example.xiaoqweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tracy on 2017/12/12.
 */

public class Forecast {
    /**
     * daily_forecast
         0
             astro
                 mr	"01:21"
                 ms	"13:41"
                 sr	"07:25"
                 ss	"16:51"
             cond
                 code_d	"101"
                 code_n	"101"
                 txt_d	"多云"
                 txt_n	"多云"
                 date	"2017-12-12"
                 hum	"13"
                 pcpn	"0.0"
                 pop	"0"
                 pres	"1034"
             tmp
                 max	"-1"
                 min	"-8"
                 uv	"2"
                 vis	"20"
             wind
                 deg	"0"
                 dir	"无持续风向"
                 sc	"微风"
                 spd	"8"
     */

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;


    @SerializedName("cond")
    public More more;



    public class Temperature{
        public String max;
        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
