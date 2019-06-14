package com.topscode.playsongwithserviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button StartServiceButton, StopServiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartServiceButton = (Button) findViewById(R.id.startService_button_id);

        StartServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaySongService.class);
                startService(intent);
            }
        });

        StopServiceButton = (Button) findViewById(R.id.stopService_button_id);

        StopServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaySongService.class);
                stopService(intent);
            }
        });
    }
}
