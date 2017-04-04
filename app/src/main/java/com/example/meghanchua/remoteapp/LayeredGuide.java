package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LayeredGuide extends AppCompatActivity {

    int channel = 3;
    int hour = 10;
    String time = " AM";
    String day = "SAT ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_guide);
        recordClick();
        upClick();
        downClick();
        leftClick();
        rightClick();
    }

    private void upClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.guide_up);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                channel--;
                if (channel<=0)
                    channel = 20;
                changingText.setText("Guide: CH." + channel + ", " + day + hour + time);
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
                channel++;
                if (channel>=21)
                    channel = 1;
                changingText.setText("Guide: CH." + channel + ", " + day + hour + time);
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
                if (day == "SAT " && hour-1==9 && time==" AM") {
                    ; // can't go back in time
                }
                else {
                    hour--;
                    if (hour<=0) {
                        hour=12;
                        if (time==" AM") {
                            time = " PM";
                            if (day=="SUN ")
                                day = "SAT ";
                        }
                        else {
                            time = " AM";
                        }
                    }
                }
                changingText.setText("Guide: CH." + channel + ", " + day + hour + time);
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
                if (day == "SUN " && hour+1==12 && time==" PM") {
                    ; // can't go forward in time
                }
                else {
                    hour++;
                    if (hour>12)
                        hour=1;
                    if (hour==12) {
                        if (time==" AM") {
                            time = " PM";
                        }
                        else {
                            time = " AM";
                            if (day=="SAT ")
                                day = "SUN ";
                        }
                    }
                }
                changingText.setText("Guide: CH." + channel + ", " + day + hour + time);
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
                changingText.setText("Record: CH." + channel + ", " + day + hour + time);
            }
        });
    }

    public void buttonOnClickSelect(View view) {
        Intent i = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        LayeredGuide.this.startActivity(i);
        finish();
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        LayeredGuide.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredGuide.this, LayeredHelpScreen.class);
        LayeredGuide.this.startActivity(helpIntent);
        finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredGuide.this.finish();
        Intent i = new Intent(LayeredGuide.this, LayeredDesignActivity.class);
        LayeredGuide.this.startActivity(i);
        finish();
    }
}
