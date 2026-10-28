package com.termux.aichat;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Activity;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        setContentView(webView);
    }
}
