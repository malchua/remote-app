package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneDesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_design);
    }

    public void buttonOnClickIphoneDesign2(View view) {
        Intent iphoneDesign2Intent = new Intent(IphoneDesignActivity.this, IphoneDesign2.class);
        IphoneDesignActivity.this.startActivity(iphoneDesign2Intent);
        finish();
    }

    public void buttonOnClickHelpScreen1(View view) {
        Intent iphoneDesignActivityIntent = new Intent(IphoneDesignActivity.this, IphoneHelpScreen.class);
        IphoneDesignActivity.this.startActivity(iphoneDesignActivityIntent);

    }
}
