package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdateEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_event);
    }

    public void onClickBack(View view) {
        Intent i=new Intent(getApplicationContext(),Events.class);
        startActivity(i);
        setContentView(R.layout.activity_events);
    }
}