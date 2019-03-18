package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button MadLibs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MadLibs = (Button)findViewById(R.id.button);
        MadLibs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        EditText personName = findViewById(R.id.personName);
         EditText personAdj = findViewById(R.id.personAdj);
        EditText profName = findViewById(R.id.profName);
         EditText pLastPartner = findViewById(R.id.personLastP);
        EditText lastPAdj = findViewById(R.id.lastPAdj);
        EditText verb = findViewById(R.id.verb);
        EditText noun = findViewById(R.id.noun);
        EditText newPAdj = findViewById(R.id.personAdj2);
        Intent intent = new Intent(this, Activity2.class);
        personName = findViewById(R.id.personName);

        String Name = personName.getText().toString();
        String firstAdj = personAdj.getText().toString();
        String profname = profName.getText().toString();
        String lastPartner = pLastPartner.getText().toString();
        String lastAdj = lastPAdj.getText().toString();
        String verb_ = verb.getText().toString();
        String noun_ = noun.getText().toString();
        String newAdj = newPAdj.getText().toString();

        String MadLibs = Games.madLibs(Name,firstAdj,profname,lastPartner,lastAdj,verb_,noun_,newAdj);

        intent.putExtra("mad",MadLibs);


        startActivity(intent);

    }
}
