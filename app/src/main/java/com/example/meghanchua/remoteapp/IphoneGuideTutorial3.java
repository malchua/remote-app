package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneGuideTutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_guide_tutorial3);
    }

    public void helpScreen(View view) {
        //Intent i = new Intent(IphoneGuideTutorial3.this, IphoneHelpScreen.class);
        //IphoneGuideTutorial3.this.startActivity(i);
        finish();
    }
}
