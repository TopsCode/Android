package com.topscode.fragmentlifecycleexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    LifeCycleFragment lifeCycleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        fragmentTransaction = fragmentManager.beginTransaction();

        lifeCycleFragment = new LifeCycleFragment();

        fragmentTransaction.add(R.id.fragment_container_id, lifeCycleFragment);

        fragmentTransaction.commit();
    }
}
