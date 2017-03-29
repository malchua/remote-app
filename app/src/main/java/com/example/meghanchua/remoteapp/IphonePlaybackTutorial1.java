package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphonePlaybackTutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_playback_tutorial1);
    }

    public void playbackTut1(View view) {
        Intent i = new Intent(IphonePlaybackTutorial1.this, IphonePlaybackTutorial2.class);
        IphonePlaybackTutorial1.this.startActivity(i);
        finish();
    }
}
