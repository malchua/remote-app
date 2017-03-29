package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneTutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_tutorial1);
    }

    public void introTut2(View view) {
        Intent i = new Intent(IphoneTutorial1.this, IphoneTutorial2.class);
        IphoneTutorial1.this.startActivity(i);
        finish();
    }
}
