package com.tops.saxparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MainActivity extends AppCompatActivity {

    Button button;
    ListView listView;
    List<Employee> employees = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    employees = SAXXMLParser.parse(getAssets().open("employees.xml"));
                    ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(MainActivity.this,
                            android.R.layout.simple_list_item_1, employees);
                    listView.setAdapter(adapter);
                    listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Employee employee = (Employee) parent.getItemAtPosition(position);
                            Toast.makeText(parent.getContext(), employee.getDetails(),
                                    Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
