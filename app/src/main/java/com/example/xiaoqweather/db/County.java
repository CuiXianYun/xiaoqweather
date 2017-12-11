package com.example.xiaoqweather.db;

/**
 * Created by Tracy on 2017/12/11.
 */

public class County {
    private int id;
    private String countyName;     //县的名字
    private String weatherId;      //天气Id
    private int    cityId;         //所属市的Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
