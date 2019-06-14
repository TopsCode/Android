package com.tops.readwritesharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.store).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputData=findViewById(R.id.input_text);
                SharedPreferences sharedPreferences=getSharedPreferences("data",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();


                editor.putString("data",inputData.getText().toString());
                editor.commit();
            }
        });

        findViewById(R.id.read).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputData=findViewById(R.id.input_text);
                SharedPreferences sharedPreferences=getSharedPreferences("data",MODE_PRIVATE);
                inputData.setText(sharedPreferences.getString("data","not found"));
            }
        });

    }
}
