package com.example.webrtctest.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.webrtctest.R;
import com.example.webrtctest.bean.UserInfo;
import com.example.webrtctest.databinding.ActivityMainBinding;
import com.example.webrtctest.handlers.MainHandler;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setHandlers(new MainHandler(this));
        binding.setUser(new UserInfo());
    }
}