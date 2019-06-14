package com.topscode.switchexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    Switch my_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        my_switch = (Switch) findViewById(R.id.switch_id);

        my_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(SwitchActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SwitchActivity.this, "Switch OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
