package com.example.yuer.healthdevicedemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yuer.healthdevicedemo.R;
import com.example.yuer.healthdevicedemo.bean.UpHealthResponse;
import com.example.yuer.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class TempertureActivity extends AppCompatActivity {

    EditText etTemper;
    Button btnSendTemper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperture);
        etTemper=(EditText) findViewById(R.id.et_temper);
        btnSendTemper=(Button) findViewById(R.id.btn_send_temper);


        //将温度传给服务器
        btnSendTemper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //说明请求成功
                // 上传数据接口  上传用户输入的温度
                //到底上传时使用post还是get要去查看接口文档
                //拿到用户输入的温度
                String temper=etTemper.getText().toString(); //temp="".怎么都传不进去
                OkGo.post(UrlUtil.SEND_DATA)
                        .tag(this)
                        .params("uid","267") //用户id
                        .params("device_id",12) //设备id
                        .params("p_id",18)  //参数id
                        .params("value",temper)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                //服务端返回值s
                                Log.d("onSuccess", "onSuccess: "+s);
                                //使用gson解析服务端返回的内容
                                Gson gson=new Gson();
                                UpHealthResponse up= gson.fromJson(s, UpHealthResponse.class);
                                Toast.makeText(TempertureActivity.this,up.getDes(),Toast.LENGTH_SHORT).show();

                            }
                        });

            }
        });
    }
}
