package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickUpdateDetails(View view) {
        Intent i=new Intent(getApplicationContext(),UserDetails.class);
        startActivity(i);
        setContentView(R.layout.activity_user_details);
    }

    public void onClickEvents(View view) {
        Intent i=new Intent(getApplicationContext(),Events.class);
        startActivity(i);
        setContentView(R.layout.activity_events);
    }
}