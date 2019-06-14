package com.topscode.checkboxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox1 = (CheckBox) findViewById(R.id.one_checkBox_id);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(CheckBoxActivity.this, "CheckBox 1 : Checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxActivity.this, "CheckBox 1 : Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox2 = (CheckBox) findViewById(R.id.two_checkBox_id);
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(CheckBoxActivity.this, "CheckBox 2 : Checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxActivity.this, "CheckBox 2 : Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3 = (CheckBox) findViewById(R.id.three_checkBox_id);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(CheckBoxActivity.this, "CheckBox 3 : Checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxActivity.this, "CheckBox 3 : Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
