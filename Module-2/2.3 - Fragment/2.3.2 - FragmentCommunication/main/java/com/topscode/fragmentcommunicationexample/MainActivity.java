package com.topscode.fragmentcommunicationexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.FragmentCommunication {

    FragmentManager fragmentManager;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = new FirstFragment();
        secondFragment =  new SecondFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.firstFragment_container_id, firstFragment, "First").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.secondFragment_container_id, secondFragment,"Second").commit();
    }

    @Override
    public void sendData(String msg) {
        SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("Second");
        if (secondFragment != null) {
            secondFragment.DisplayData(msg);
        }
    }
}