package com.example.uperfect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro1 extends AppCompatActivity {

    private Button imgbtn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        imgbtn1 = (Button) findViewById(R.id.imgbtn1);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(intro1.this,intro2.class);
                startActivity(intent);
            }
        });
        overridePendingTransition(0, 0);

    }
}
