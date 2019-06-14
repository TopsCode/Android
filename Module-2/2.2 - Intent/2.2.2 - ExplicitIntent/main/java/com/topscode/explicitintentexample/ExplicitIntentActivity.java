package com.topscode.explicitintentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExplicitIntentActivity extends AppCompatActivity {
    EditText Demo_EditText;
    Button Send_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        Demo_EditText = (EditText) findViewById(R.id.demo_editText_id);
        Send_Button = (Button) findViewById(R.id.send_button_id);
        Send_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sendData = Demo_EditText.getText().toString();
                Intent intent = new Intent(ExplicitIntentActivity.this, DisplayActivity.class);
                intent.putExtra("MyData",sendData);
                startActivity(intent);
            }
        });
    }
}
