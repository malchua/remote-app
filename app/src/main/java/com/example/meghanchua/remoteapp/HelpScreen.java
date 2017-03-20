package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_screen);
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(HelpScreen.this, LayeredDesignActivity.class);
        HelpScreen.this.startActivity(mainMenuIntent);
    }

    public void buttonOnClickBack(View view) {
        HelpScreen.this.finish();
    }
}
