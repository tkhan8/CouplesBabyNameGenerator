package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class girlgene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girlgene);

        TextView girl = findViewById(R.id.gbaby);
        girl.setText(getIntent().getStringExtra("girl"));
    }
}