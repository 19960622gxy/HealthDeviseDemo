package com.example.yuer.healthdevicedemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yuer.healthdevicedemo.R;
import com.example.yuer.healthdevicedemo.bean.RegeistResponse;
import com.example.yuer.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class RegeistActivity extends AppCompatActivity {

    private static final String TAG = "RegeistActivity";
    EditText etRegeistName,etRegeistPassword,etRegeistCheckPassword;
    Button btnRegeist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regeist);
 //BufferKnife插件 可以一键搞定控件初始化

        etRegeistName=(EditText) findViewById(R.id.etRegeistName);
    etRegeistPassword=(EditText) findViewById(R.id.etRegeistPassword);
    etRegeistCheckPassword=(EditText) findViewById(R.id.etRegeistCheckPassword);
    btnRegeist=(Button) findViewById(R.id.btnRegeist);

    btnRegeist.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            regeist();
        }
    });
}

    private void regeist() {
        //注册功能
        //获取到用户输入的内容
        String regeistName=etRegeistName.getText().toString();
        String regeistPassword=etRegeistPassword.getText().toString();
        String regeistCheckPassword=etRegeistCheckPassword.getText().toString();
        if (regeistName.equals("")||regeistPassword.equals("")||regeistCheckPassword.equals(""))
        {
            Toast.makeText(this,"请完善用户信息",Toast.LENGTH_SHORT).show();
        }
        else
        {
            if (!regeistPassword.equals(regeistCheckPassword))
            {
                Toast.makeText(this,"两次输入的密码不相同",Toast.LENGTH_SHORT).show();
            }
            else
            {
                //输入无误，去请求服务端注册接口
                OkGo.post(UrlUtil.REGEIST)
                        .tag(this)
                        .params("phone",regeistName)
                        .params("password",regeistPassword)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                //解析
                                Gson gson=new Gson();
                                RegeistResponse regeistRsponse=gson.fromJson(s,RegeistResponse.class);
                                int status=regeistRsponse.getStatus();
                                String des=regeistRsponse.getDes();
                                if (status==1)
                                {
                                    finish();

                                }
                                Toast.makeText(RegeistActivity.this,""+des,Toast.LENGTH_SHORT).show();
                                Log.d(TAG, "onSuccess: "+s);
                            }
                        });
            }
        }
    }
}
