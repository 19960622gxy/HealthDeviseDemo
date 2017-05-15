package com.example.yuer.healthdevicedemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Yuer on 2017/4/19.
 */

public class MyVPAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    //数据源 内容项
    public MyVPAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
