package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_tutorial2);
    }

    public void introTut3(View view) {
        Intent i = new Intent(IphoneTutorial2.this, IphoneTutorial3.class);
        IphoneTutorial2.this.startActivity(i);
        finish();
    }
}
