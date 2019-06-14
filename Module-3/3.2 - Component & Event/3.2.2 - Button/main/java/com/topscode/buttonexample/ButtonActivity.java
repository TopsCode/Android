package com.topscode.buttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    Button ShowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        ShowButton = (Button) findViewById(R.id.show_button_id);

        ShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "onClick() Called", Toast.LENGTH_SHORT).show();
            }
        });

        ShowButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(ButtonActivity.this, "onLongClick() called", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
