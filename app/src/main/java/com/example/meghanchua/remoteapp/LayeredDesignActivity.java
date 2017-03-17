package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredDesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_design);
    }

    public void buttonOnClickRemote(View view) {
        Intent remoteIntent = new Intent(LayeredDesignActivity.this, LayeredMain.class);
        LayeredDesignActivity.this.startActivity(remoteIntent);
    }

    public void buttonOnClickGuide(View view) {
        Intent guideIntent = new Intent(LayeredDesignActivity.this, LayeredGuide.class);
        LayeredDesignActivity.this.startActivity(guideIntent);
    }

    public void buttonOnClickPlayback(View view) {
        Intent playbackIntent = new Intent(LayeredDesignActivity.this, LayeredPlayback.class);
        LayeredDesignActivity.this.startActivity(playbackIntent);
    }
}
