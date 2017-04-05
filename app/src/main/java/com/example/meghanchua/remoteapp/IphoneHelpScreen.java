package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.meghanchua.remoteapp.objects.UserProfile;

public class IphoneHelpScreen extends AppCompatActivity {

    private UserProfile user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_help_screen);

        Intent intent = getIntent();
        user = (UserProfile) intent.getSerializableExtra("user");

        if (user == null)
            user = new UserProfile();
        displayUser(user);
    }

    private void displayUser(UserProfile user)
    {
        TextView display = (TextView) findViewById(R.id.screen);
        display.setText(user.displayTV());
    }

    public void buttonOnClickBack(View view) {
        IphoneHelpScreen.this.finish();
    }

    public void guidehelp(View view) {
        Intent i = new Intent(IphoneHelpScreen.this, IphoneGuideTutorial1.class);
        IphoneHelpScreen.this.startActivity(i);
        //finish();
    }

    public void playbackhelp(View view) {
        Intent i = new Intent(IphoneHelpScreen.this, IphonePlaybackTutorial1.class);
        IphoneHelpScreen.this.startActivity(i);
        //finish();
    }

    public void recordhelp(View view) {
        Intent i = new Intent(IphoneHelpScreen.this, IphoneRecordTutorial1.class);
        IphoneHelpScreen.this.startActivity(i);
        //finish();
    }
}
