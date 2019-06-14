package com.topscode.explicitintentexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView Result_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Result_TextView = (TextView) findViewById(R.id.result_textView_id);
        String receiveData = getIntent().getStringExtra("MyData");
        Result_TextView.setText(receiveData);
    }
}
