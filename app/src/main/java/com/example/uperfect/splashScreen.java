package com.example.uperfect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class splashScreen extends AppCompatActivity {
    private static int wait = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        overridePendingTransition(0, 0);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                boolean previouslyStarted = prefs.getBoolean("isFirstTime", false);
                if (!previouslyStarted) {
                    SharedPreferences.Editor edit = prefs.edit();
                    edit.putBoolean("isFirstTime", Boolean.TRUE);
                    edit.apply();
                    Intent intent = new Intent(splashScreen.this, intro1.class);
                    startActivity(intent);
                    finish();
                } else {
                    startActivity(new Intent(splashScreen.this, webView.class));
                    finish();
                }
            }
        }, wait);
    }
}
