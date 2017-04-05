package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.meghanchua.remoteapp.objects.UserProfile;

public class LayeredGuide extends AppCompatActivity {

    private UserProfile user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_guide);
        recordClick();
        upClick();
        downClick();
        leftClick();
        rightClick();

        Intent intent = getIntent();
        user = (UserProfile) intent.getSerializableExtra("user");

        if (user == null)
            user = new UserProfile();
        user.enterGuide();
        displayUser(user);
    }

    private void displayUser(UserProfile user)
    {
        TextView display = (TextView) findViewById(R.id.screen);
        display.setText(user.displayGuide());
    }

    private void upClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.guide_up);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                user.increaseGuideChannel();
                changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
            }
        });
    }

    private void downClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.guide_down);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                user.decreaseGuideChannel();
                changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
            }
        });
    }

    private void leftClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.guide_left);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.getDay().equals("SAT") && user.getGuideHour()-1==9 && user.getGuideTime().equals("AM")) {
                    ; // can't go back in time
                }
                else {
                    user.decreaseGuideHour();
                }
                changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
            }
        });
    }

    private void rightClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.guide_right);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.getDay().equals("SUN") && user.getGuideHour()+1==12 && user.getGuideTime().equals("PM")) {
                    ; // can't go forward in time
                }
                else {
                    user.increaseGuideHour();
                }
                changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
            }
        });
    }

    private void recordClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.layered_record);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                changingText.setText("Record: CH." + user.getGuideChannel() + ", " + user.getDate());
            }
        });
    }

    public void buttonOnClickSelect(View view) {
        user.selectChannel();
        Intent i = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        i.putExtra("user", user);
        LayeredGuide.this.startActivity(i);
        finish();
    }

    public void buttonOnClickMainMenu(View view) {
        user.exitGuide();
        Intent mainMenuIntent = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        mainMenuIntent.putExtra("user", user);
        LayeredGuide.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredGuide.this, LayeredHelpScreen.class);
        helpIntent.putExtra("user", user);
        LayeredGuide.this.startActivity(helpIntent);
        //finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredGuide.this.finish();
        user.exitGuide();
        Intent i = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        i.putExtra("user", user);
        LayeredGuide.this.startActivity(i);
        finish();
    }
}
