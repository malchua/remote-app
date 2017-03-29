package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_tutorial2);
    }

    public void t2(View view) {
        Intent i = new Intent(LayeredTutorial2.this, LayeredTutorial3.class);
        LayeredTutorial2.this.startActivity(i);
        finish();
    }
}
