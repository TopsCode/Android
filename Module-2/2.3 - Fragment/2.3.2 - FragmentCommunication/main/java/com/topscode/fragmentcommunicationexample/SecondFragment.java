package com.topscode.fragmentcommunicationexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    TextView ReceiveDataTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_second, container,false);

        ReceiveDataTextView = (TextView) rootView.findViewById(R.id.receiveData_textView_id);

        return rootView;
    }

    public void DisplayData(String msg){
        ReceiveDataTextView.setText("Received Data: " + msg);
    }

}
