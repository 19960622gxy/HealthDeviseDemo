package com.example.yuer.healthdevicedemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yuer.healthdevicedemo.R;
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

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    List<DeviceResponse.DataBean> dataList;
    ListView lv;
    DeviceLVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv=(ListView) findViewById(R.id.lv);

        dataList=new ArrayList<>();//实例化
        adapter=new DeviceLVAdapter(this,dataList);
//                                  上下文，数据源
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //listview的item点击监听    单击事件 setOnItemLongClick....就是长按事件
                switch (position)
                {
                    case 0:
                        Intent intent=new Intent(MainActivity.this,TempertureActivity.class);
                        startActivity(intent);
                        break;
//                    case 1:
//                        //跳转到血氧仪的界面
//                        Intent intent1=new Intent(MainActivity.this,);
//                        startActivity(intent1);
                }




            }
        });

        //进入mainactivity之后立刻就请求数据
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
