package com.tops.ReadWriteFileExternalStorage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    EditText textmsg;
    static final int READ_BLOCK_SIZE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},123);
        }else{
            findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WriteBtn();
                }
            });
            findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ReadBtn();
                }
            });
        }

        textmsg=findViewById(R.id.editText1);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==123){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        WriteBtn();
                    }
                });
                findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ReadBtn();
                    }
                });
            }
        }
    }

    public void WriteBtn() {
        File storage= Environment.getExternalStorageDirectory();
        File file=new File(storage.getAbsolutePath(),"/abc.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            String text=textmsg.getText().toString();
            fileOutputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadBtn() {
        File storage= Environment.getExternalStorageDirectory();
        File file=new File(storage.getAbsoluteFile(),"/abc.txt");

        try {
            FileInputStream fileInputStream=new FileInputStream(file);
           byte[] text=new byte[fileInputStream.available()];
           fileInputStream.read(text);
           String data=new String(text);
           textmsg.setText(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
