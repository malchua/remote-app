package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphonePlaybackTutorial4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_playback_tutorial4);
    }

    public void playbackTut4(View view) {
        Intent i = new Intent(IphonePlaybackTutorial4.this, IphonePlaybackTutorial5.class);
        IphonePlaybackTutorial4.this.startActivity(i);
        finish();
    }
}
