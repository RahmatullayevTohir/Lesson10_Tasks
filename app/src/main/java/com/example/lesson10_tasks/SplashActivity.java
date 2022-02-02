package com.example.lesson10_tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        initViews();
    }

    private void initViews() {
        countDownTimer();
    }
    void countDownTimer(){
        new CountDownTimer(4000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                openSingInActivity();
            }
        }.start();
    }
    void openSingInActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}