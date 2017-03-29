package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredRecordTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_record_tutorial2);
    }

    public void t1(View view) {
        Intent i = new Intent(LayeredRecordTutorial2.this, LayeredRecordTutorial3.class);
        LayeredRecordTutorial2.this.startActivity(i);
        finish();
    }
}
