package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneRecordTutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_record_tutorial3);
    }

    public void helpScreen(View view) {
        //Intent i = new Intent(IphoneRecordTutorial3.this, IphoneHelpScreen.class);
        //IphoneRecordTutorial3.this.startActivity(i);
        finish();
    }
}
