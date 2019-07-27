package com.example.uperfect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro3 extends AppCompatActivity {

    private Button imgbtn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro3);

        imgbtn3 =(Button) findViewById(R.id.imgbtn3);
//        imgbtn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =  new Intent(intro3.this,webView.class);
//                startActivity(intent);
//            }
//        });

      //  overridePendingTransition(0, 0);

    }

    public void clickhere(View view) {
        Intent intent = new Intent( intro3.this,webView.class);
        startActivity(intent);


    }
}
