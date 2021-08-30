package com.inflames1986.myintentsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public static final String ARG_NAME = "ARG_NAME";
    public static final String ARG_SURNAME = "ARG_SURNAME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name = findViewById(R.id.name);
        TextView surname = findViewById(R.id.surname);

        Intent launchIntent = getIntent();

        if (getIntent() != null) {

            name.setText(launchIntent.getStringExtra(ARG_NAME));
            surname.setText(launchIntent.getStringExtra(ARG_SURNAME));
        }
    }
}