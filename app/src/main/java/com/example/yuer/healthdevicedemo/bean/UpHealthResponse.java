package com.example.yuer.healthdevicedemo.bean;

/**
 * Created by Yuer on 2017/4/19.
 */

public class UpHealthResponse {

    /**
     * status : 1
     * des : 上传成功！
     */

    private int status;
    private String des;

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
}
