package com.topscode.textviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);

        textView = (TextView) findViewById(R.id.example_textView_id);
        textView.setText("Hello ! This is the example of TextView");
    }
}
