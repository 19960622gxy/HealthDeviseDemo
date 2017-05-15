package com.example.yuer.healthdevicedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yuer.healthdevicedemo.R;
import com.example.yuer.healthdevicedemo.bean.DeviceResponse;
import com.example.yuer.healthdevicedemo.utils.UrlUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Yuer on 2017/4/18.
 */

public class DeviceLVAdapter extends BaseAdapter {
    Context context;
    List<DeviceResponse.DataBean> dataList;
    public DeviceLVAdapter(Context context, List<DeviceResponse.DataBean> dataList) {
        this.context=context;//拿到数据和上下文
        this.dataList=dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();// 一定要写  有多少项就展示多少项
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //通过布局文件生成对应的view
        View view1= LayoutInflater.from(context).inflate(R.layout.item_device,parent,false);
        //获取view1中的控件
//        ImageView iv= (ImageView) view1.findViewById(R.id.iv_item_device);
        SimpleDraweeView iv= (SimpleDraweeView) view1.findViewById(R.id.iv_item_device);
        TextView tvName= (TextView) view1.findViewById(R.id.tv_item_name);
        TextView tvDes= (TextView) view1.findViewById(R.id.tv_item_des);
        //赋值
//        iv.setImageResource(R.mipmap.ic_launcher);
//        iv.setImageURI();
        iv.setImageURI(UrlUtil.HOST+dataList.get(position).getPic().substring(1));
//                                                          从第几个字符开始截取，索引号

        tvName.setText(dataList.get(position).getName());
        tvDes.setText(dataList.get(position).getDesc());
        return view1;
    }
}
