package com.example.uperfect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intro2 extends AppCompatActivity {
    private ImageView imgbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        imgbtn2 = (ImageView) findViewById(R.id.imgbtn2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(intro2.this,intro3.class);
                startActivity(intent);
            }
        });

//        public void clickhere(View view) {
//            Intent intent = new Intent(this,webView.class);
//            startActivity(intent);
        //}
        overridePendingTransition(0, 0);

    }
}
