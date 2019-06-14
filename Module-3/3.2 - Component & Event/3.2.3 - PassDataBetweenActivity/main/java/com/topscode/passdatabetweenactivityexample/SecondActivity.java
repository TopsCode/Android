package com.topscode.passdatabetweenactivityexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView Result_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Result_TextView = (TextView) findViewById(R.id.result_textView_id);
        String receiveData = getIntent().getStringExtra("MyData");
        Result_TextView.setText(receiveData);
    }
}
