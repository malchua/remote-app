package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredPlaybackTutorial4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_playback_tutorial4);
    }

    public void t1(View view) {
        Intent i = new Intent(LayeredPlaybackTutorial4.this, LayeredPlaybackTutorial5.class);
        LayeredPlaybackTutorial4.this.startActivity(i);
        finish();
    }
}
