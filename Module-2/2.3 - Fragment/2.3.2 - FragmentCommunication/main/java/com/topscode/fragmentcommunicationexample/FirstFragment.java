package com.topscode.fragmentcommunicationexample;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    FragmentCommunication fragmentCommunication;
    EditText Demo_EditText;
    Button Send_Button;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentCommunication = (FragmentCommunication)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_first, container,false);

        Demo_EditText = (EditText) rootView.findViewById(R.id.demo_editText_id);
        Send_Button = (Button) rootView.findViewById(R.id.send_button_id);

        Send_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = Demo_EditText.getText().toString();
                fragmentCommunication.sendData(message);
            }
        });

        return rootView;
    }

    interface FragmentCommunication {

        void sendData(String msg);
    }

    
}
