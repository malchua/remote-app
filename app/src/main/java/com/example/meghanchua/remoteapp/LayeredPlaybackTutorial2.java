package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredPlaybackTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_playback_tutorial2);
    }

    public void t1(View view) {
        Intent i = new Intent(LayeredPlaybackTutorial2.this, LayeredPlaybackTutorial3.class);
        LayeredPlaybackTutorial2.this.startActivity(i);
    }
}
