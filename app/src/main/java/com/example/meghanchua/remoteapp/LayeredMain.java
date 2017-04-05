package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LayeredMain extends AppCompatActivity {

    int channel=3;
    boolean power = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_main);
        powerClick();
        channelDownClick();
        channelUpClick();
        volumeDownClick();
        volumeUpClick();
    }

    private void powerClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_power);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (power) {
                    power = false;
                    changingText.setText("TV: Turned Off");
                }
                else {
                    power = true;
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
                if (power) {
                    channel++;
                    if (channel > 20)
                        channel = 1;
                    changingText.setText("TV: CH." + channel);
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
                if (power) {
                    channel--;
                    if (channel < 1)
                        channel = 20;
                    changingText.setText("TV: CH." + channel);
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
                if (power)
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
                if (power)
                    changingText.setText("TV: Vol. decreased");
            }
        });
    }


    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredMain.this, LayeredDesignActivity.class);
        LayeredMain.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredMain.this, LayeredHelpScreen.class);
        LayeredMain.this.startActivity(helpIntent);
        finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredMain.this.finish();
        Intent i = new Intent(LayeredMain.this, LayeredDesignActivity.class);
        LayeredMain.this.startActivity(i);
        finish();
    }
}
