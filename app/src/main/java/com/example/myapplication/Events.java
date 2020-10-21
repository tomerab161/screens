package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void onClickNewEvent(View view) {
        Intent i=new Intent(getApplicationContext(),NewEvent.class);
        startActivity(i);
        setContentView(R.layout.activity_new_event);
    }

    public void onClickUpdateEvent(View view) {
        Intent i=new Intent(getApplicationContext(),UpdateEvent.class);
        startActivity(i);
        setContentView(R.layout.activity_update_event);
    }
}