package com.topscode.webviewexample;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.IOException;
import java.io.InputStream;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webView = (WebView) findViewById(R.id.webView_id);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/index.html");
    }
}
