package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IphoneGuideTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_guide_tutorial2);
    }

    public void guideTut2(View view) {
        Intent i = new Intent(IphoneGuideTutorial2.this, IphoneGuideTutorial3.class);
        IphoneGuideTutorial2.this.startActivity(i);
        finish();
    }
}
