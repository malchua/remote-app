package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneGuideTutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_guide_tutorial1);
    }

    public void guideTut1(View view) {
        Intent i = new Intent(IphoneGuideTutorial1.this, IphoneGuideTutorial2.class);
        IphoneGuideTutorial1.this.startActivity(i);
        finish();
    }
}
