package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mom3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom3);

        TextView mom = findViewById(R.id.text2);
        mom.setText("Hello, "+getIntent().getStringExtra("mom"));

        Button happy = findViewById(R.id.trait1);
        Button loyal = findViewById(R.id.trait2);
        Button loving = findViewById(R.id.trait3);
        Button gene = findViewById(R.id.trait4);
        EditText text = findViewById(R.id.edittext);
        Button next = findViewById(R.id.next1);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(happy.getText().toString());
            }
        });

        loyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(loyal.getText().toString());
            }
        });
        loving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(loving.getText().toString());
            }
        });
        gene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(gene.getText().toString());
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  next();
            }
        });

    }

            public void next(){
                EditText text = findViewById(R.id.edittext);
                String mom = text.getText().toString();
                Intent intent = new Intent(this, dad3.class);
                intent.putExtra("mom", mom);
                startActivity(intent);
            }
}