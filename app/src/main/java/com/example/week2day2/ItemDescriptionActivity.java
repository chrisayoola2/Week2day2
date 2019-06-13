package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ItemDescriptionActivity extends AppCompatActivity {
    TextView tvDescriptionDisplay;
    String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);
        tvDescriptionDisplay = findViewById(R.id.tvDescriptionDisplay);

        Intent intent = getIntent();
        description = intent.getStringExtra("animal_passed");
        tvDescriptionDisplay.setText(description);

    }
}
