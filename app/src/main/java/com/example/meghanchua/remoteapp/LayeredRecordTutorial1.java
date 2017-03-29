package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredRecordTutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_record_tutorial1);
    }

    public void t1(View view) {
        Intent i = new Intent(LayeredRecordTutorial1.this, LayeredRecordTutorial2.class);
        LayeredRecordTutorial1.this.startActivity(i);
    }
}
