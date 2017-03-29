package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredPlayback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_playback);
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredPlayback.this, LayeredDesignActivity.class);
        LayeredPlayback.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredPlayback.this, LayeredHelpScreen.class);
        LayeredPlayback.this.startActivity(helpIntent);
        finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredPlayback.this.finish();
        Intent i = new Intent(LayeredPlayback.this, LayeredDesignActivity.class);
        LayeredPlayback.this.startActivity(i);
        finish();
    }
}
