package com.topscode.setparentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ParentActivity extends AppCompatActivity {

    Button Goto_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        Goto_Button = (Button) findViewById(R.id.goto_button_id);
        Goto_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentActivity.this, ChildActivity.class);
                startActivity(intent);
            }
        });
    }
}
