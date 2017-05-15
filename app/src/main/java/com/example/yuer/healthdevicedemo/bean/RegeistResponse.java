package com.example.yuer.healthdevicedemo.bean;

/**
 * Created by Yuer on 2017/4/18.
 */

public class RegeistResponse {


    /**
     * status : 1
     * des : 注册成功！
     * data : 300
     */

    private int status;
    private String des;
    private int data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

