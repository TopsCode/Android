package com.topscode.firebasedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView) findViewById(R.id.textView_id);

        textView.setText("Name: " + getIntent().getStringExtra("fname") + " " +getIntent().getStringExtra("lname") + "\n"
                + "Gender: " + getIntent().getStringExtra("gender") + "\n"
                + "Email:" + getIntent().getStringExtra("email") + "\n"
                + "Mobile No: " + getIntent().getStringExtra("mobileno"));
    }
}
