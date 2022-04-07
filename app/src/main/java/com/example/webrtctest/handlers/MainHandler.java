package com.example.webrtctest.handlers;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.example.webrtctest.bean.UserInfo;
import com.example.webrtctest.util.LinphoneUtil;

public class MainHandler {
    Context context;
    private LinphoneUtil linphoneUtil =new LinphoneUtil();
    public MainHandler(Context context){
        this.context=context;
    }
    public void onRegisterClick(View view, UserInfo user){
        Log.i("=========",user.toString());
        linphoneUtil.initCore(context);
        linphoneUtil.registerUser(user.name,user.password,user.ip,user.port);
    }
}
