package com.example.playsongfromserver;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener {
    String url="http://10.0.2.2/digitalsociety/song.mp3";
    private MediaPlayer mediaPlayer;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=findViewById(R.id.imageButton);
    }

    public void playSong(View view) {
        if(mediaPlayer==null){
            mediaPlayer=new MediaPlayer();
            try {
                mediaPlayer.setDataSource(url);
                mediaPlayer.prepareAsync();
                mediaPlayer.setOnPreparedListener(this);
                imageButton.setImageResource(android.R.drawable.ic_media_pause);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            if (mediaPlayer.isPlaying()) {
                imageButton.setImageResource(android.R.drawable.ic_media_play);
                mediaPlayer.pause();
            }
            else {
                mediaPlayer.start();
                imageButton.setImageResource(android.R.drawable.ic_media_pause);
            }

        }

    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mediaPlayer.start();
    }
}
