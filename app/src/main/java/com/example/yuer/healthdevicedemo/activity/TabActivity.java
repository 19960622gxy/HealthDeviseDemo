package com.example.yuer.healthdevicedemo.activity;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yuer.healthdevicedemo.MyFragment1;
import com.example.yuer.healthdevicedemo.MyFragment2;
import com.example.yuer.healthdevicedemo.MyFragment3;
import com.example.yuer.healthdevicedemo.R;
import com.example.yuer.healthdevicedemo.adapter.MyVPAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity implements View.OnClickListener {

    ViewPager vp;
    List<Fragment> fragments;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        //页面滑动切换效果 使用ViewPager
        vp=(ViewPager) findViewById(R.id.vp);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn1.setTextColor(Color.RED);//启动就提示是在页面1

        fragments=new ArrayList<>();

        fragments.add(new MyFragment1());
        fragments.add(new MyFragment2());
        fragments.add(new MyFragment3());

        MyVPAdapter adapter=new MyVPAdapter(getSupportFragmentManager(),fragments);

        vp.setAdapter(adapter);
        //页面切换的时候的一个监听
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                Toast.makeText(TabActivity.this,"切换至"+position,Toast.LENGTH_SHORT).show();
                switch (position)
                {
                    case 0:
                        btn1.setTextColor(Color.RED);
                        btn2.setTextColor(Color.BLACK);
                        btn3.setTextColor(Color.BLACK);
                        break;
                    case 1:
                        btn1.setTextColor(Color.BLACK);
                        btn2.setTextColor(Color.RED);
                        btn3.setTextColor(Color.BLACK);
                        break;
                    case 2:
                        btn1.setTextColor(Color.BLACK);
                        btn2.setTextColor(Color.BLACK);
                        btn3.setTextColor(Color.RED);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn1:
//                 将页面切换至页面1  将按钮和页面联系到一起
                vp.setCurrentItem(0);
                break;
            case R.id.btn2:
                vp.setCurrentItem(1);
                break;
            case R.id.btn3:
                vp.setCurrentItem(2);
                break;
        }
    }
}
