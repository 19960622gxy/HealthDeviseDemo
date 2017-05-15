package com.example.yuer.healthdevicedemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuer.healthdevicedemo.activity.TempertureActivity;
import com.example.yuer.healthdevicedemo.adapter.WordAdapter;
import com.example.yuer.healthdevicedemo.bean.DeviceResponse;
import com.example.yuer.healthdevicedemo.bean.UpHealthResponse;
import com.example.yuer.healthdevicedemo.bean.WordResponse;
import com.example.yuer.healthdevicedemo.utils.UrlUtil;
import com.facebook.common.logging.LoggingDelegate;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by Yuer on 2017/4/19.
 */

public class MyFragment2 extends Fragment {

    ListView lvword;
    List<WordResponse.ResultBean.DataBean> dataList;
    WordAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //通过布局文件 创建该fragment的view
        View view=inflater.inflate(R.layout.fragment_my2,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataList = new ArrayList<>();
        lvword=(ListView) view.findViewById(R.id.lvWord);

        adapter=new WordAdapter(getContext(),dataList);
        lvword.setAdapter(adapter);
        getData();
    }

    private void getData() {
            //请求数据
//        "http://juheimg.oss-cn-hangzhou.aliyuncs.com/docs/juhe.doc"
        OkGo.get("http://japi.juhe.cn/joke/content/list.from")
                .tag(this)
                .params("key","f3526961c64ed213038e8efb632d9424")
                .params("sort","asc")
                .params("pagesize",20)
                .params("time","1418816972")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        Gson gson=new Gson();
                        WordResponse wordResponse=gson.fromJson(s,WordResponse.class);
                        int errorCode=wordResponse.getError_code();
//                        //返回说明
                        String reason=wordResponse.getReason();
//                       dataList=wordResponse.getResult().getData();
                        dataList.addAll(wordResponse.getResult().getData());
//                        Log.d(TAG, "onSuccess: "+resultList.getMes_path());
//                        Log.d(TAG, "onSuccess: "+resultList.getSourceurl());
//                        Toast.makeText(this,reason,Toast.LENGTH_SHORT).show();
//                        resultList=wordResponse.getResult();
//                        resultList.addAll((Collection<? extends WordResponse.ResultBean>) wordResponse.getResult());
//                        resultList.getSourceurl();
//                        resultList.getMes_path();
                        adapter.notifyDataSetChanged();//刷新一下

                        Log.d(TAG, "onSuccess: "+s);
                    }
                }); 
    }
}
