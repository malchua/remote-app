package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayeredMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_main);
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredMain.this, LayeredDesignActivity.class);
        LayeredMain.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredMain.this, LayeredHelpScreen.class);
        LayeredMain.this.startActivity(helpIntent);
        finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredMain.this.finish();
        Intent i = new Intent(LayeredMain.this, LayeredDesignActivity.class);
        LayeredMain.this.startActivity(i);
        finish();
    }
}
