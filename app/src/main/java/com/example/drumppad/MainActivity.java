package com.example.drumppad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6,
                mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11, mediaPlayer12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.one);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.two);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.three);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.four);
        mediaPlayer5 = MediaPlayer.create(this, R.raw.fv);
        mediaPlayer6 = MediaPlayer.create(this, R.raw.sixth);
        mediaPlayer7 = MediaPlayer.create(this, R.raw.seventh);
        mediaPlayer8 = MediaPlayer.create(this, R.raw.eighth);
        mediaPlayer9 = MediaPlayer.create(this, R.raw.one);
        mediaPlayer10 = MediaPlayer.create(this, R.raw.fv);
        mediaPlayer11 = MediaPlayer.create(this, R.raw.four);
        mediaPlayer12 = MediaPlayer.create(this, R.raw.three);

    }

    public void setMediaPlayer(View view) {
        int identifier = view.getId();
        switch (identifier) {
            case R.id.imageButton1:
                mediaPlayer1.start();
                break;

            case R.id.imageButton2:
                mediaPlayer2.start();
                break;

            case R.id.imageButton3:
                mediaPlayer3.start();
                break;

            case R.id.imageButton4:
                mediaPlayer4.start();
                break;

            case R.id.imageButton5:
                mediaPlayer5.start();
                break;

            case R.id.imageButton6:
                mediaPlayer6.start();
                break;

            case R.id.imageButton7:
                mediaPlayer7.start();
                break;

            case R.id.imageButton8:
                mediaPlayer8.start();
                break;

            case R.id.imageButton9:
                mediaPlayer9.start();
                break;

            case R.id.imageButton10:
                mediaPlayer10.start();
                break;

            case R.id.imageButton11:
                mediaPlayer11.start();
                break;

            case R.id.imageButton12:
                mediaPlayer12.start();
                break;
        }
    }
}
