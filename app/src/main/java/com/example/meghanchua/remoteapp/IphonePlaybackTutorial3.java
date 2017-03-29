package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphonePlaybackTutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_playback_tutorial3);
    }

    public void playbackTut3(View view) {
        Intent i = new Intent(IphonePlaybackTutorial3.this, IphonePlaybackTutorial4.class);
        IphonePlaybackTutorial3.this.startActivity(i);
        finish();
    }
}
