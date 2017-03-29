package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneTutorial4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_tutorial4);
    }

    public void mainMenu(View view) {
        Intent i = new Intent(IphoneTutorial4.this, IphoneDesignActivity.class);
        IphoneTutorial4.this.startActivity(i);
        finish();
    }
}
