package com.example.servicetops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    Context context;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        seekBar=findViewById(R.id.progress);
        btnStart=findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // MyIntentService.startActionBaz(context,"Good","Very Good");
                Intent intent = new Intent(context, DownloadService.class);
                intent.putExtra("url", "http://xitij1.ga/images/dhadak.mp4");
                intent.putExtra("receiver", new DownloadReceiver(new Handler()));
                startService(intent);

            }
        });


        //mProgressDialog.show();
        /*Intent intent = new Intent(this, DownloadService.class);
        intent.putExtra("url", "http://xitij1.ga/images/dhadak.mp4");
        intent.putExtra("receiver", new DownloadReceiver(new Handler()));
        startService(intent);
*/
    }

    class DownloadReceiver extends ResultReceiver {

        public DownloadReceiver(Handler handler) {
            super(handler);
        }

        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {

            super.onReceiveResult(resultCode, resultData);

            if (resultCode == DownloadService.UPDATE_PROGRESS) {

                int progress = resultData.getInt("progress"); //get the progress
                //dialog.setProgress(progress);
                seekBar.setProgress(progress);

                if (progress == 100) {
                    //dialog.dismiss();
                }
            }
        }
    }
}
