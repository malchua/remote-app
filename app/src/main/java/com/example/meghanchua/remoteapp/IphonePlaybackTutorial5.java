package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphonePlaybackTutorial5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_playback_tutorial5);
    }

    public void playbackTut5(View view) {
        Intent i = new Intent(IphonePlaybackTutorial5.this, IphonePlaybackTutorial6.class);
        IphonePlaybackTutorial5.this.startActivity(i);
        finish();
    }
}
