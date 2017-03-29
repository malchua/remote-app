package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneTutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_tutorial3);
    }

    public void introTut4(View view) {
        Intent i = new Intent(IphoneTutorial3.this, IphoneTutorial4.class);
        IphoneTutorial3.this.startActivity(i);
        finish();
    }
}
