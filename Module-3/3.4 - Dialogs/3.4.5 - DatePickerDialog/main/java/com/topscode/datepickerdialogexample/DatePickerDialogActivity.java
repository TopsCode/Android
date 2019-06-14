package com.topscode.datepickerdialogexample;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DatePickerDialogActivity extends AppCompatActivity {

    DatePickerDialog datePickerDialog;
    int year,month,day;
    Button button;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dialog);

        button = (Button) findViewById(R.id.button_id);

        calendar = Calendar.getInstance();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DatePickerDialogActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(DatePickerDialogActivity.this, String.valueOf(dayOfMonth) + "/" + String.valueOf(month) + "/" + String.valueOf(year), Toast.LENGTH_SHORT).show();
                    }
                },year,month,day);

                datePickerDialog.show();
            }
        });
    }
}
