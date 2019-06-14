package com.topscode.fragmentlifecycleexample;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LifeCycleFragment extends Fragment {

    String TAG = "FragmentLifeCycle";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "onAttach() called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate() called");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG,"onCreateView() called");
        return inflater.inflate(R.layout.fragment_life_cycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG,"onViewCreated() called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG,"onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG,"onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG,"onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG,"onStop() called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG,"onDestroyView() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy() called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG,"onDetach() called");
    }
}
