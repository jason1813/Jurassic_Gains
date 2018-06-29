package com.buinvent.jurassic_gains;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WorkoutActivity extends AppCompatActivity {

    public static final String EXTRA_DAY = "com.buinvent.jurassic_gains.DAY";
    String[] exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Intent dayNumIntent = getIntent();
        String dayExtra = dayNumIntent.getStringExtra(EXTRA_DAY);
        TextView topText = findViewById(R.id.dayText);
        topText.setText(dayExtra);

        if(dayExtra.equals(getResources().getString(R.string.day1))){
            exercises = new String[]{"Bench Press", "Skull Crushers", "Flyes", "Incline Bench Press"};
        }
        else if(dayExtra.equals(getResources().getString(R.string.day2))){
            exercises = new String[]{"Chin-Ups", "Bicep Curls", "Bent Over Rows", "Lat Pulldown"};
        }
        else if(dayExtra.equals(getResources().getString(R.string.day4))){
            exercises = new String[]{"Squats", "Leg Extensions", "Leg Curls", "Calf Raises"};
        }
        else if(dayExtra.equals(getResources().getString(R.string.day5))){
            exercises = new String[]{"Shoulder Press", "Side Lateral Raise", "upright rows", "Seated Bent Over Flys"};
        }

        for(int i = 0; i < exercises.length; i++){
            
        }

    }
}