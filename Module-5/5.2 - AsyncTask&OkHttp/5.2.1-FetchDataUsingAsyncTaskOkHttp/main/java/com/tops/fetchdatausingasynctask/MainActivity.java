package com.tops.fetchdatausingasynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double lat = 40.712774, lon = -74.006091;
        String units = "imperial";
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?lat=%f&lon=%f&units=%s&appid=%s",
                lat, lon, units, "4a7c24cda5111d0166032bdf02665931");

        TextView textView = (TextView) findViewById(R.id.textView);
        new GetWeatherTask(textView).execute(url);
    }
}
class GetWeatherTask extends AsyncTask<String, Void, String> {
    private TextView textView;

    public GetWeatherTask(TextView textView) {
        this.textView = textView;
    }

    @Override
    protected String doInBackground(String... strings) {
        String weather = "UNDEFINED";
        try {
            URL url = new URL(strings[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            InputStream stream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder = new StringBuilder();

            String inputString;
            while ((inputString = bufferedReader.readLine()) != null) {
                builder.append(inputString);
            }

            JSONObject topLevel = new JSONObject(builder.toString());
            JSONObject main = topLevel.getJSONObject("main");
            weather = String.valueOf(main.getDouble("temp"));

            urlConnection.disconnect();
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return weather;
    }

    @Override
    protected void onPostExecute(String temp) {
        textView.setText("Current Weather: " + temp);
    }
}