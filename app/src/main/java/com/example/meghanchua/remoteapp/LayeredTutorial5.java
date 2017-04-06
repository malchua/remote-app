package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredTutorial5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_tutorial5);
    }

    public void t5(View view) {
        Intent i = new Intent(LayeredTutorial5.this, LayeredDesignActivity.class);
        LayeredTutorial5.this.startActivity(i);
        finish();
    }
}
