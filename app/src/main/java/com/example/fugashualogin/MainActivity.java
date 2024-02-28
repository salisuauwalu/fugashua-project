package com.example.fugashualogin;
import static com.example.fugashualogin.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        webView = findViewById(id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.getDisplayZoomControls();
        webSettings.setSupportZoom(true);
        webSettings.supportZoom();
        webView.loadUrl("https://fugashua.safsrms.com");
    }
}