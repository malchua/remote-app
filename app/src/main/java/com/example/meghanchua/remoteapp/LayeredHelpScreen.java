package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredHelpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_help_screen);
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredHelpScreen.this, LayeredDesignActivity.class);
        LayeredHelpScreen.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredHelpScreen.this.finish();
    }

    public void guidehelp(View view) {
        Intent i = new Intent(LayeredHelpScreen.this, LayeredGuideTutorial1.class);
        LayeredHelpScreen.this.startActivity(i);
        finish();
    }

    public void playbackhelp(View view) {
        Intent i = new Intent(LayeredHelpScreen.this, LayeredPlaybackTutorial1.class);
        LayeredHelpScreen.this.startActivity(i);
        finish();
    }

    public void recordhelp(View view) {
        Intent i = new Intent(LayeredHelpScreen.this, LayeredRecordTutorial1.class);
        LayeredHelpScreen.this.startActivity(i);
        finish();
    }
}
