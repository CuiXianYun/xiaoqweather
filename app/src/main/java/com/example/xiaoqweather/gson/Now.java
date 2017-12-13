package com.example.xiaoqweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tracy on 2017/12/12.
 */

public class Now {
    /**
     * now
         cond
             code	"101"
             txt	"多云"
             fl	"-15"
             hum	"24"
             pcpn	"0"
             pres	"1035"
             tmp	"-6"
             vis	"8"
         wind
             deg	"17"
             dir	"东北风"
             sc	"微风"
             spd	"10"
     */

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
