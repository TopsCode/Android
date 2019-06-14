package com.tops.readwritefileinternalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private final String filenameInternal = "couponsFile";
    private final String filenameExternal = "cashbackFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =  findViewById(R.id.file_info);
    }


    public void writeFileInternalStorage(View view) {
        String coupons = "Get upto 20% off mobile @ xyx shop \n Get upto 30% off on appliances @ yuu shop";
        createUpdateFile(filenameInternal, coupons, false);
    }

    public void appendFileInternalStorage(View view) {
        String coupons = "Get upto 50% off fashion @ xyx shop \n Get upto 80% off on beauty @ yuu shop";
        createUpdateFile(filenameInternal, coupons, true);
    }

    public void readFileInternalStorage(View view) {
        try {
            FileInputStream fileInputStream = openFileInput(filenameInternal);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

            StringBuffer sb = new StringBuffer();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            tv.setText(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createUpdateFile(String fileName, String content, boolean update) {
        FileOutputStream outputStream;

        try {
            if (update) {
                outputStream = openFileOutput(fileName, Context.MODE_APPEND);
            } else {
                outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
            }
            outputStream.write(content.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
