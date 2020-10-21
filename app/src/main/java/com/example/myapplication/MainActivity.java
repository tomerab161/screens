package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View view) {
        Intent i=new Intent(getApplicationContext(),Main.class);
        startActivity(i);
        setContentView(R.layout.activity_main2);
    }

    public void onClockRegister(View view) {
        Intent i=new Intent(getApplicationContext(),Register.class);
        startActivity(i);
        setContentView(R.layout.activity_register);
    }
}