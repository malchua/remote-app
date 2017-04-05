package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphonePlaybackTutorial6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_playback_tutorial6);
    }

    public void helpScreen(View view) {
        //Intent i = new Intent(IphonePlaybackTutorial6.this, IphoneHelpScreen.class);
        //IphonePlaybackTutorial6.this.startActivity(i);
        finish();
    }
}
