package com.tops.onetimeloginsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sharedPreferences=getSharedPreferences("user_session",MODE_PRIVATE);

        if(sharedPreferences.getBoolean("session",false) &&
        !sharedPreferences.getString("email","").isEmpty()){

            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            finish();
        }

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email=findViewById(R.id.email);


                sharedPreferences.edit().putString("email",email.getText().toString()).commit();
                sharedPreferences.edit().putBoolean("session",true).commit();

                startActivity(new Intent(MainActivity.this,HomeActivity.class));
                finish();
            }
        });

    }
}
