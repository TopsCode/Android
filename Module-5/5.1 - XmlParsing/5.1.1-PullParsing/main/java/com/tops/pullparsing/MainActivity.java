package com.tops.pullparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        InputStream stream = this.getResources().openRawResource(R.raw.student);

        try {
            XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = xmlPullParserFactory.newPullParser();

            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(stream, null);

            String tag_name = "", text = "";
            int event = parser.getEventType();

            while (event != XmlPullParser.END_DOCUMENT) {
                tag_name = parser.getName();

                switch (event) {
                    case XmlPullParser.START_TAG:
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:
                        switch(tag_name) {
                            case "name": textView.append("Name: " + text + "\n");
                                break;
                            case "rollno": textView.append("Roll No: " + text + "\n");
                                break;
                            case "age": textView.append("Age: " + text + "\n\n");
                                break;
                        }
                        break;
                }

                event = parser.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
