package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredTutorial0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_tutorial0);
    }

    public void t0(View view) {
        Intent i = new Intent(LayeredTutorial0.this, LayeredTutorial1.class);
        LayeredTutorial0.this.startActivity(i);
        finish();
    }
}
