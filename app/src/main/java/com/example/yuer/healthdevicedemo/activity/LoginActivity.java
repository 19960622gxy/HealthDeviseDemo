package com.example.yuer.healthdevicedemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuer.healthdevicedemo.R;
import com.example.yuer.healthdevicedemo.bean.UserInfo;
import com.example.yuer.healthdevicedemo.utils.UrlUtil;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etUserName,etPassword;
    Button btnLogin;
    TextView tvRegeist;
    SimpleDraweeView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //获取实例
        etUserName=(EditText) findViewById(R.id.etUserName);
        etPassword=(EditText) findViewById(R.id.etPassword);
        btnLogin=(Button) findViewById(R.id.btnLogin);
        tvRegeist=(TextView) findViewById(R.id.tvRegeist);
        pic=(SimpleDraweeView) findViewById(R.id .pic);
        pic.setImageURI(UrlUtil.HOST+"/upload/device/20160820150015.jpg");


        btnLogin.setOnClickListener(this);
        tvRegeist.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnLogin:
                login();
                break;
            case R.id.tvRegeist:
                Intent intent=new Intent(LoginActivity.this,RegeistActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void login() {
        //做登陆操作  okgo请求相关接口
        //http://115.159.75.231/api.php?a=Home&f=login  登陆接口 请求方式是post
        String phone=etUserName.getText().toString();  //18360903445
        String password=etPassword.getText().toString();//wb102030

        OkGo.post(UrlUtil.LOGIN)
                .tag(this)
                .params("phone",phone)
                .params("password",password)
                .execute(new StringCallback() {   //接受返回值
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        //请求成功后的回调方法  请求一旦成功 进入这里
                        //所有返回值用字符串返回
                        Gson gson=new Gson();
                        UserInfo user=gson.fromJson(s,UserInfo.class);
                        //                          字符串  类型
                        int status=user.getStatus();
                        String des=user.getDes();
                        if (status==1)
                        {
                            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                        Toast.makeText(LoginActivity.this,""+des,Toast.LENGTH_SHORT).show();

                        Log.d("onSuccess", "onSuccess: "+s);

                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        Toast.makeText(LoginActivity.this,"请求失败",Toast.LENGTH_SHORT).show();

                    }
                });

    }
}
