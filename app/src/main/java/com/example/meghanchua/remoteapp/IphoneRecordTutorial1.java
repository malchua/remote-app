package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneRecordTutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_record_tutorial1);
    }

    public void recordTut1(View view) {
        Intent i = new Intent(IphoneRecordTutorial1.this, IphoneRecordTutorial2.class);
        IphoneRecordTutorial1.this.startActivity(i);
        finish();
    }
}
