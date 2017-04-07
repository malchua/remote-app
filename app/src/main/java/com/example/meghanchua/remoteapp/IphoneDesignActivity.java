package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.meghanchua.remoteapp.objects.UserProfile;

public class IphoneDesignActivity extends AppCompatActivity {

    private UserProfile user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_design);

        Intent intent = getIntent();
        user = (UserProfile) intent.getSerializableExtra("user");

        if (user == null)
            user = new UserProfile();
        displayUser(user);

        powerClick();
        channelDownClick();
        channelUpClick();
        volumeDownClick();
        volumeUpClick();
    }

    private void displayUser(UserProfile user)
    {
        TextView display = (TextView) findViewById(R.id.screen);
        display.setText(user.displayTV());
    }

    private void powerClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.imageButton);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.hasPower()) {
                    user.powerOff();
                    changingText.setText("TV: Turned Off");
                }
                else {
                    user.powerOn();
                    changingText.setText("TV: Turned On");
                }
            }
        });
    }

    private void channelUpClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.imageButton3);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.hasPower()) {
                    user.increaseCurrentChannel();
                    changingText.setText("TV: CH." + user.getCurrentChannel());
                }
            }
        });
    }

    private void channelDownClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.imageButton5);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.hasPower()) {
                    user.decreaseCurrentChannel();
                    changingText.setText("TV: CH." + user.getCurrentChannel());
                }
            }
        });
    }

    private void volumeUpClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.imageButton2);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.hasPower())
                    changingText.setText("TV: Vol. increased");
            }
        });
    }

    private void volumeDownClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.imageButton4);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.hasPower())
                    changingText.setText("TV: Vol. decreased");
            }
        });
    }

    public void buttonOnClickIphoneDesign2(View view) {
        Intent iphoneDesign2Intent = new Intent(IphoneDesignActivity.this, IphoneDesign2.class);
        iphoneDesign2Intent.putExtra("user", user);
        IphoneDesignActivity.this.startActivity(iphoneDesign2Intent);
        finish();
    }

    public void buttonOnClickHelpScreen1(View view) {
        Intent iphoneDesignActivityIntent = new Intent(IphoneDesignActivity.this, IphoneHelpScreen.class);
        iphoneDesignActivityIntent.putExtra("user", user);
        IphoneDesignActivity.this.startActivity(iphoneDesignActivityIntent);
    }
}
