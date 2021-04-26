package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        TextView boy = findViewById(R.id.bbaby);
        TextView girl = findViewById(R.id.gbaby);

        boy.setText("Boy: "+getIntent().getStringExtra("boy"));
        girl.setText("Girl: "+getIntent().getStringExtra("girl"));
    }
}