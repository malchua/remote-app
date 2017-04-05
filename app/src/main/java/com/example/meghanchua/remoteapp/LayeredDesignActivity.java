package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.meghanchua.remoteapp.objects.UserProfile;

public class LayeredDesignActivity extends AppCompatActivity {

    private UserProfile user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_design);

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

    public void buttonOnClickRemote(View view) {
        Intent remoteIntent = new Intent(LayeredDesignActivity.this, LayeredMain.class);
        remoteIntent.putExtra("user", user);
        LayeredDesignActivity.this.startActivity(remoteIntent);
        finish();
    }

    public void buttonOnClickGuide(View view) {
        Intent guideIntent = new Intent(LayeredDesignActivity.this, LayeredGuide.class);
        guideIntent.putExtra("user", user);
        LayeredDesignActivity.this.startActivity(guideIntent);
        finish();
    }

    public void buttonOnClickPlayback(View view) {
        Intent playbackIntent = new Intent(LayeredDesignActivity.this, LayeredPlayback.class);
        playbackIntent.putExtra("user", user);
        LayeredDesignActivity.this.startActivity(playbackIntent);
        finish();
    }

    public void buttonOnClickMainMenu(View view) {
        /*Intent mainMenuIntent = new Intent(LayeredDesignActivity.this, MainActivity.class);
        LayeredDesignActivity.this.startActivity(mainMenuIntent);
        finish();*/
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredDesignActivity.this, LayeredHelpScreen.class);
        helpIntent.putExtra("user", user);
        LayeredDesignActivity.this.startActivity(helpIntent);
        //finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredDesignActivity.this.finish();
    }
}
