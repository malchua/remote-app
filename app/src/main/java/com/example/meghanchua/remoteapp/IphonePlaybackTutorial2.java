package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphonePlaybackTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_playback_tutorial2);
    }

    public void playbackTut2(View view) {
        Intent i = new Intent(IphonePlaybackTutorial2.this, IphonePlaybackTutorial3.class);
        IphonePlaybackTutorial2.this.startActivity(i);
        finish();
    }
}
