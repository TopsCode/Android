package com.topscode.autocompletetextviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] city_names = {"Ahmadabad", "Surat", "Nadiad", "Mehsana", "Gandhinagar", "Ananad", "Petlad", "Rajkot", "Palanpur", "Kalol"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, city_names);

        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}
