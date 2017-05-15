package com.example.yuer.healthdevicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yuer.healthdevicedemo.activity.MainActivity;
import com.example.yuer.healthdevicedemo.activity.TempertureActivity;
import com.example.yuer.healthdevicedemo.adapter.DeviceLVAdapter;
import com.example.yuer.healthdevicedemo.bean.DeviceResponse;
import com.example.yuer.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by Yuer on 2017/4/19.
 */

public class MyFragment1 extends Fragment {
    ListView lvDevice;
    List<DeviceResponse.DataBean> dataList;
    DeviceLVAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //通过布局文件 创建该fragment的view
        View view=inflater.inflate(R.layout.fragment_my1,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //view创建完毕后会执行的方法
        super.onViewCreated(view, savedInstanceState);
        lvDevice=(ListView) view.findViewById(R.id.lvDevice);
        dataList=new ArrayList<>();
        adapter=new DeviceLVAdapter(getContext(),dataList);

        lvDevice.setAdapter(adapter);
        getData();

    }

    private void getData() {
        //请求数据
        OkGo.get(UrlUtil.DEVICE_LIST)
                .tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        //拿到了javabean 可以通过Gson进行解析
                        Gson gson=new Gson();
                        DeviceResponse deviceResponse=gson.fromJson(s,DeviceResponse.class);
//                                                                    字符串，类型
                        //读数据 拿请求码
                        int status=deviceResponse.getStatus();
                        //读数据 拿描述
                        String des=deviceResponse.getDes();
                        dataList.addAll(deviceResponse.getData());//拿数据列表 数据源的集合
//                                       deviceResponse.getData().get(0);//拿数据裂变第一条数据,还能进一步数据
//                                       deviceResponse.getData().get(1).getName();
//                                       dataList.get(0).getName();
                        //有了数据要刷新一下
                        adapter.notifyDataSetChanged();//刷新listview

                        //捕捉到返回的json字符串，用于创建对应的javaBean
                        Log.d(TAG, "onSuccess: "+s);

                    }
                });
    }
}
