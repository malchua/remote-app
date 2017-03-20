package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_guide);
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        LayeredGuide.this.startActivity(mainMenuIntent);
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredGuide.this, HelpScreen.class);
        LayeredGuide.this.startActivity(helpIntent);
    }

    public void buttonOnClickBack(View view) {
        LayeredGuide.this.finish();
    }
}
