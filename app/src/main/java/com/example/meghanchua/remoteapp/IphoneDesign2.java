package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.meghanchua.remoteapp.objects.UserProfile;

public class IphoneDesign2 extends AppCompatActivity {

    private UserProfile user;
    int item = 1;
    boolean playing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_design2);
        guideClick();
        recordClick();
        upClick();
        downClick();
        leftClick();
        rightClick();
        buttonOnClickSelect();

        recordedClick();
        rewindClick();
        forwardClick();
        pauseClick();
        stopClick();
        playClick();
        backClick();

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

    private void guideClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        Button changeTextButton = (Button) findViewById(R.id.button15);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                user.enterGuide();
                changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
            }
        });
    }

    private void upClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.guide_up);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.onGuide()) {
                    user.increaseGuideChannel();
                    changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
                }
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
                if (user.onGuide()) {
                    user.decreaseGuideChannel();
                    changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
                }
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
                if (user.onGuide()) {
                    if (user.getDay().equals("SAT") && user.getGuideHour() - 1 == 9 && user.getGuideTime().equals("AM")) {
                        ; // can't go back in time
                    } else {
                        user.decreaseGuideHour();
                    }
                    changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
                }
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
                if (user.onGuide()) {
                    if (user.getDay().equals("SUN") && user.getGuideHour() + 1 == 12 && user.getGuideTime().equals("PM")) {
                        ; // can't go forward in time
                    } else {
                        user.increaseGuideHour();
                    }
                    changingText.setText("Guide: CH." + user.getGuideChannel() + ", " + user.getDate());
                }
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
                if (user.onGuide()) {
                    changingText.setText("Record: CH." + user.getGuideChannel() + ", " + user.getDate());
                }
                else if (!user.onRecord()) {
                    changingText.setText("Record: CH." + user.getCurrentChannel() + ", " + user.getDate());
                }
            }
        });
    }

    public void buttonOnClickSelect() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        Button changeTextButton = (Button) findViewById(R.id.button14);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.onGuide()) {
                    user.selectChannel();
                    changingText.setText("TV: CH." + user.getCurrentChannel() + ", " + user.getDate());
                }
            }
        });
    }

    private void recordedClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        Button changeTextButton = (Button) findViewById(R.id.button16);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                user.enterRecord();
                changingText.setText("Playback: On Vid 1");
            }
        });
    }

    private void rewindClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_rewind);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (playing)
                    changingText.setText("Playback: RWing Vid " + item);
            }
        });
    }

    private void forwardClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_forward);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (playing)
                    changingText.setText("Playback: FFing Vid " + item);
            }
        });
    }

    private void pauseClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_pause);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (playing)
                    changingText.setText("Playback: Paused Vid " + item);
            }
        });
    }

    private void stopClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_stop);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (playing) {
                    playing = false;
                    changingText.setText("Playback: On Vid " + item);
                }
            }
        });
    }

    private void playClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_play);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.onRecord()) {
                    playing = true;
                    changingText.setText("Playback: Playing Vid " + item);
                }
            }
        });
    }

    private void backClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        Button changeTextButton = (Button) findViewById(R.id.button18);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (user.onRecord() || user.onGuide()) {
                    user.exitGuide();
                    user.exitRecord();
                    changingText.setText("Exit to TV: CH." + user.getCurrentChannel());
                }
            }
        });
    }

    public void buttonOnClickIphoneDesign(View view) {
        Intent iphoneDesignActivityIntent = new Intent(IphoneDesign2.this, IphoneDesignActivity.class);
        iphoneDesignActivityIntent.putExtra("user", user);
        IphoneDesign2.this.startActivity(iphoneDesignActivityIntent);
        finish();
    }

    public void buttonOnClickHelpScreen2(View view) {
        Intent iphoneDesignActivityIntent = new Intent(IphoneDesign2.this, IphoneHelpScreen.class);
        iphoneDesignActivityIntent.putExtra("user", user);
        IphoneDesign2.this.startActivity(iphoneDesignActivityIntent);
    }
}
