package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class girlService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_service);

        TextView view = findViewById(R.id.girl);
        String girl = getIntent().getStringExtra("girl");
        view.setText(girl);
    }
}