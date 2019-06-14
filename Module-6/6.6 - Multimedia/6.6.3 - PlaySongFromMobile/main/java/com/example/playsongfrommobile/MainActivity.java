package com.example.playsongfrommobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSION_REQUEST_CODE = 100;
    private MediaPlayer mediaPlayer;
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=findViewById(R.id.imageButton);
        // write code to read external storage
       checkPermission();
    }

    private void checkPermission() {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST_CODE);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch(requestCode){
            case MY_PERMISSION_REQUEST_CODE:{
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    // Permission granted
                    Toast.makeText(this, "Thank you", Toast.LENGTH_SHORT).show();
                }else {
                    // Permission denied
                }
            }
        }
    }

    public void playSong(View view) {
        if(mediaPlayer==null){
            mediaPlayer=new MediaPlayer();
            File file= Environment.getExternalStorageDirectory();
            file=new File(file,"song.mp3");
            imageButton.setImageResource(android.R.drawable.ic_media_pause);
            if(file.exists()){
                Uri uri = Uri.fromFile(file);
                mediaPlayer = MediaPlayer.create(this,uri);
                mediaPlayer.start();
            }
        }else{
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
                imageButton.setImageResource(android.R.drawable.ic_media_play);
            }else{
                mediaPlayer.start();
                imageButton.setImageResource(android.R.drawable.ic_media_pause);

            }
        }
    }
}
