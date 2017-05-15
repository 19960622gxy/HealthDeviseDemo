package com.example.yuer.healthdevicedemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.lzy.okgo.OkGo;

/**
 * Created by Yuer on 2017/4/17.
 */

public class App extends Application {
    //会在应用启动时立即调用 做初始化工作   需要在manifest中设置name属性 此时App是灰色的

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化OKGO框架
        OkGo.init(this);
        //可以额外设置OKGO属性 比如 超时  缓存


        //初始化网络图片的展示  初始化Fresco框架
        Fresco.initialize(this);
    }
}
