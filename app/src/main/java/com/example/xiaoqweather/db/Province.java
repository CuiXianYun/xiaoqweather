package com.example.xiaoqweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Tracy on 2017/12/11.
 */


public class Province extends DataSupport{
    private int id;                  //每个实体类都有的id
    private String provinceName;     //省的id
    private int provinceCode;        //省的名字

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
