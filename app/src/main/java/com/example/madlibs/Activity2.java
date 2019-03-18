package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //receive the intent
        Intent intent = getIntent();

        String madL = intent.getStringExtra("mad");
        TextView madV = findViewById(R.id.madView);

       madV.setText(madL);
    }


}
