package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.meghanchua.remoteapp.objects.UserProfile;

public class LayeredMain extends AppCompatActivity {

    private UserProfile user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_main);
        powerClick();
        channelDownClick();
        channelUpClick();
        volumeDownClick();
        volumeUpClick();

        Intent intent = getIntent();
        user = (UserProfile) intent.getSerializableExtra("user");

        if (user == null)
            user = new UserProfile();
        displayUser(user);
    }

    private void displayUser(UserProfile user)
    {
        final TextView display = (TextView) findViewById(R.id.screen);
        display.setText(user.displayTV());
    }

    private void powerClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_power);
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
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.channel_up);
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
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.channel_down);
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
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.volume_up);
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
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.volume_down);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.hasPower())
                    changingText.setText("TV: Vol. decreased");
            }
        });
    }


    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredMain.this, LayeredDesignActivity.class);
        mainMenuIntent.putExtra("user", user);
        LayeredMain.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredMain.this, LayeredHelpScreen.class);
        helpIntent.putExtra("user", user);
        LayeredMain.this.startActivity(helpIntent);
        //finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredMain.this.finish();
        Intent i = new Intent(LayeredMain.this, LayeredDesignActivity.class);
        i.putExtra("user", user);
        LayeredMain.this.startActivity(i);
        finish();
    }
}
