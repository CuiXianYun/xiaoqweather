package com.example.xiaoqweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tracy on 2017/12/12.
 */

public class Basic {
/**
 *   basic
         city	"北京"
         cnty	"中国"
         id	"CN101010100"
         lat	"39.90498734"
         lon	"116.4052887"
         update
             loc	"2017-12-12 01:50"
             utc	"2017-12-11 17:50"
 */
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
