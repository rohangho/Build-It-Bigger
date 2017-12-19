package com.example.android.display_my_joke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView joke=(TextView) findViewById(R.id.displayer);
        Intent intent=getIntent();
        joke.setText(intent.getStringExtra("key"));


    }
}
