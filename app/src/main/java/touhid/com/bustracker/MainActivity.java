package touhid.com.bustracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView contentWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = contentWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        contentWebView.loadUrl("http://192.168.0.107:8080");
        contentWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(contentWebView.canGoBack()){
            contentWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
