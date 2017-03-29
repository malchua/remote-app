package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneDesign2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_design2);
    }

    public void buttonOnClickIphoneDesign(View view) {
        Intent iphoneDesignActivityIntent = new Intent(IphoneDesign2.this, IphoneDesignActivity.class);
        IphoneDesign2.this.startActivity(iphoneDesignActivityIntent);
        finish();
    }

    public void buttonOnClickHelpScreen2(View view) {
        Intent iphoneDesignActivityIntent = new Intent(IphoneDesign2.this, IphoneHelpScreen.class);
        IphoneDesign2.this.startActivity(iphoneDesignActivityIntent);
    }
}
