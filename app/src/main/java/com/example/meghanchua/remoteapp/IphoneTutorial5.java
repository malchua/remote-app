package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneTutorial5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_tutorial5);
    }

    public void mainMenu(View view) {
        Intent i = new Intent(IphoneTutorial5.this, IphoneDesignActivity.class);
        IphoneTutorial5.this.startActivity(i);
        finish();
    }
}
