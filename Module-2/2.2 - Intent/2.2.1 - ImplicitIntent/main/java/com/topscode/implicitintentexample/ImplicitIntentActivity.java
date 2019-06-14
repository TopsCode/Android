package com.topscode.implicitintentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitIntentActivity extends AppCompatActivity {

    EditText Url_EditText;
    Button Search_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        Url_EditText = (EditText) findViewById(R.id.url_editText_id);
        Search_Button = (Button) findViewById(R.id.search_button_id);

        Search_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = Url_EditText.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
