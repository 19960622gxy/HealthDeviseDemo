package com.example.yuer.healthdevicedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.yuer.healthdevicedemo.MyFragment2;
import com.example.yuer.healthdevicedemo.R;
import com.example.yuer.healthdevicedemo.bean.WordResponse;

import java.util.List;

/**
 * Created by Yuer on 2017/4/19.
 */

public class WordAdapter extends BaseAdapter {

    Context context;
    List<WordResponse.ResultBean.DataBean> dataList;
    public WordAdapter(Context context, List<WordResponse.ResultBean.DataBean> dataList) {
        this.context=context;
        this.dataList=dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= LayoutInflater.from(context).inflate(R.layout.item_word,viewGroup,false);

        //获取控件
        TextView tv1= (TextView) view1.findViewById(R.id.tv_item_hashCode);
        TextView tv2= (TextView) view1.findViewById(R.id.tv_item_content);
        TextView tv3= (TextView) view1.findViewById(R.id.tv_item_time);

        //赋值
        tv1.setText(dataList.get(i).getHashId());
        tv2.setText(dataList.get(i).getContent());
        tv3.setText(dataList.get(i).getUpdatetime());
        return view1;
    }
}
