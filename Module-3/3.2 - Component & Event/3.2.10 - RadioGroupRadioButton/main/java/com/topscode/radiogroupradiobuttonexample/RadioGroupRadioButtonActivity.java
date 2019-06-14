package com.topscode.radiogroupradiobuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupRadioButtonActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_radio_button);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){

                    case R.id.one_radioButton_id:
                        Toast.makeText(RadioGroupRadioButtonActivity.this, "Radio Button 1", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.two_radioButton_id:
                        Toast.makeText(RadioGroupRadioButtonActivity.this, "Radio Button 2", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.three_radioButton_id:
                        Toast.makeText(RadioGroupRadioButtonActivity.this, "Radio Button 3", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
