package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredTutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_tutorial3);
    }

    public void t3(View view) {
        Intent i = new Intent(LayeredTutorial3.this, LayeredTutorial4.class);
        LayeredTutorial3.this.startActivity(i);
    }
}
