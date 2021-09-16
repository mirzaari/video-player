package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;

public class videoplayer extends AppCompatActivity {


    WebView webView;
    public static String video_url1 = "https://www.youtube.com/embed/PG53NSAYuMg",video_url2 = "https://www.youtube.com/embed/zgUiRrrVt3Q";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);
        video_url1 = "https://www.youtube.com/embed/PG53NSAYuMg";
        video_url2 = "https://www.youtube.com/embed/zgUiRrrVt3Q";


        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(video_url1);


        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(video_url2);
    }
}