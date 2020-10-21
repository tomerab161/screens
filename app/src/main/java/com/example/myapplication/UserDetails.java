package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
    }

    public void onClickBack(View view) {
        Intent i=new Intent(getApplicationContext(),Main.class);
        startActivity(i);
        setContentView(R.layout.activity_main2);
    }
}