package com.example.uperfect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class webView extends AppCompatActivity {
    private WebView webView;
//    private long backPressedTime;
//    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        //        webView.setWebChromeClient(new MyCustomChromeClient(this));
//        webView.setWebViewClient(new MyCustomWebViewClient(this));
//        webView.clearCache(true);
//        webView.clearHistory();
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.loadUrl("https://uperfect.in/");
    }

//    @Override
//    public void onBackPressed() {
//
//
//        if(backPressedTime + 2000 >System.currentTimeMillis()){
//            backToast.cancel();
//            super.onBackPressed();
//            return;
//        }else{
//           backToast =  Toast.makeText(getBaseContext(),"Press Back Again to Exit",Toast.LENGTH_SHORT);
//            backToast.show();
//        }
//
//
//        backPressedTime =System.currentTimeMillis();


    //}
}
