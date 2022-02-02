package com.example.lesson10_tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        initViews();
    }

    private void initViews() {
        Button button = findViewById(R.id.b_next_singIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // openSingInActivity();
                finish();
            }
        });
    }
    void openSingInActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}