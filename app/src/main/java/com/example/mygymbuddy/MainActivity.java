package com.example.mygymbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {


    NumberPicker possibilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        // define the texts to be displayed by the number picker
        String[] possibilitiesStrings = {
                "Legs",
                "Biceps&Triceps",
                "Chest",
                "Back",
                "Shoulders",
        };
        // associate the defined texts to the number picker
        possibilities.setDisplayedValues(possibilitiesStrings);

        // the number picker offers 4 choices, indexed from 0 to 3
        // (length of the array of strings is 4)
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length - 1);

    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
    public void endd(View V){
        finishAffinity();
    }
    public void nextact(View v) {
        int choice = possibilities.getValue();
        Intent gotos = new Intent();

        if (choice == 2) {
            gotos.setClass(this, chest.class);
            startActivity(gotos);

        } else if (choice == 1) {
            gotos.setClass(this, biceps.class);
            startActivity(gotos);
        } else if (choice == 0) {
            gotos.setClass(this, legs.class);
            startActivity(gotos);
        } else if (choice == 3) {
            gotos.setClass(this, back.class);
            startActivity(gotos);
        } else if (choice == 4) {
            gotos.setClass(this, shoulders.class);
            startActivity(gotos);
        }

    }
}