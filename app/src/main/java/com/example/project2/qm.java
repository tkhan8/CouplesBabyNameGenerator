package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class qm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qm);

        TextView mom = findViewById(R.id.textqm2);
        mom.setText("Hello, "+getIntent().getStringExtra("mom"));

        EditText text = findViewById(R.id.edittext10);

        Button happy2 = findViewById(R.id.trait11);
        Button loving2 = findViewById(R.id.trait12);
        Button loyal2 = findViewById(R.id.trait13);
        Button gener2 = findViewById(R.id.trait14);
        Button next = findViewById(R.id.next11);

        String h2 = happy2.getText().toString();
        String lv2 = loving2.getText().toString();
        String ly2 = loyal2.getText().toString();
        String g2 = gener2.getText().toString();

        happy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(h2);
            }
        });
        loving2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(lv2);
            }
        });
        loyal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(ly2);
            }
        });
        gener2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(g2);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tex();
            }
        });
    }

        public void tex (){

            EditText text = findViewById(R.id.edittext10);
            String qm = text.getText().toString();

            Intent intent = new Intent(this, qd.class);
            intent.putExtra("trt",qm);
            startActivity(intent);

        }
}