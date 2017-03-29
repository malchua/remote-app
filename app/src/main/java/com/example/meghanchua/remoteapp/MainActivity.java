package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClickLayeredDesign(View view) {
        Intent layeredDesignIntent = new Intent(MainActivity.this, LayeredTutorial0.class);
        MainActivity.this.startActivity(layeredDesignIntent);
        finish();
    }

    public void buttonOnClickIphoneDesign(View view) {
        Intent iphoneDesignIntent = new Intent(MainActivity.this, IphoneTutorial1.class);
        MainActivity.this.startActivity(iphoneDesignIntent);
        finish();
    }
}
