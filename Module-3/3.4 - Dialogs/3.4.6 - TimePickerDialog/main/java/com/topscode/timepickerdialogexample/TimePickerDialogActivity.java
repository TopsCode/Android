package com.topscode.timepickerdialogexample;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class TimePickerDialogActivity extends AppCompatActivity {

    int Hour, Minutes;
    Button button;
    Calendar calendar;
    TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);

        button = (Button) findViewById(R.id.button_id);
        calendar = Calendar.getInstance();
        Hour = calendar.get(Calendar.HOUR_OF_DAY);
        Minutes = calendar.get(Calendar.MINUTE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerDialog = new TimePickerDialog(TimePickerDialogActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Toast.makeText(TimePickerDialogActivity.this, String.valueOf(hourOfDay) + ":" + String.valueOf(minute), Toast.LENGTH_SHORT).show();
                    }
                }, Hour, Minutes, true);

                timePickerDialog.show();
            }
        });

    }
}
