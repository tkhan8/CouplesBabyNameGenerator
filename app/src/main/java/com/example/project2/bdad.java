package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bdad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdad);

        TextView b = findViewById(R.id.text5);
        String dad = getIntent().getStringExtra("dad");
        b.setText("Hello, " + dad);

        Button happy = findViewById(R.id.trait5);
        Button loyal = findViewById(R.id.trait6);
        Button loving = findViewById(R.id.trait7);
        Button gene = findViewById(R.id.trait8);
        EditText text = findViewById(R.id.editTexta2);
        Button next = findViewById(R.id.nextw);

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
        EditText text = findViewById(R.id.editTexta2);
        String dad = text.getText().toString();
        Intent intent = new Intent(this, bmom.class);
        intent.putExtra("dad",dad);
        startActivity(intent);
    }

}