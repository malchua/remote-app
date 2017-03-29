package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneRecordTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_record_tutorial2);
    }

    public void recordTut2(View view) {
        Intent i = new Intent(IphoneRecordTutorial2.this, IphoneRecordTutorial3.class);
        IphoneRecordTutorial2.this.startActivity(i);
        finish();
    }
}
