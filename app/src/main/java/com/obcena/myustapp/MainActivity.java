package com.obcena.myustapp;

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

    public void displayPortals(View v){
        Intent i = new Intent(this, Portals.class);
        startActivity(i);
    }

    public void displayGreetings(View v){
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }


}
