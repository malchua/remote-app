package com.example.meghanchua.remoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LayeredPlayback extends AppCompatActivity {
    int item = 1;
    boolean playing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layered_playback);
        upClick();
        downClick();
        rewindClick();
        forwardClick();
        pauseClick();
        stopClick();
        playClick();
        deleteClick();
    }

    private void deleteClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        Button changeTextButton = (Button) findViewById(R.id.button_delete);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (playing)
                    ;
                else
                    changingText.setText("Playback: Deleted Vid " + item);
            }
        });
    }

    private void upClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_up);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    item--;
                    if (item < 1)
                        item = 1;
                    changingText.setText("Playback: On Vid " + item);
                }
            }
        });
    }

    private void downClick() {
        final TextView changingText = (TextView) findViewById(R.id.screen);
        ImageButton changeTextButton = (ImageButton) findViewById(R.id.button_down);
        changeTextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    item++;
                    if (item > 10)
                        item = 10;
                    changingText.setText("Playback: On Vid " + item);
                }
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
                playing = true;
                changingText.setText("Playback: Playing Vid " + item);
            }
        });
    }

    public void buttonOnClickMainMenu(View view) {
        Intent mainMenuIntent = new Intent(LayeredPlayback.this, LayeredDesignActivity.class);
        LayeredPlayback.this.startActivity(mainMenuIntent);
        finish();
    }

    public void buttonOnClickHelp(View view) {
        Intent helpIntent = new Intent(LayeredPlayback.this, LayeredHelpScreen.class);
        LayeredPlayback.this.startActivity(helpIntent);
        finish();
    }

    public void buttonOnClickBack(View view) {
        //LayeredPlayback.this.finish();
        Intent i = new Intent(LayeredPlayback.this, LayeredDesignActivity.class);
        LayeredPlayback.this.startActivity(i);
        finish();
    }
}
