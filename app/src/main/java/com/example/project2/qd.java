package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class qd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qd);

        TextView text = findViewById(R.id.text15);


        text.setText("Hello, dad");


        EditText tes = findViewById(R.id.editTextab2);
        Button happy2 = findViewById(R.id.trait35);
        Button loving2 = findViewById(R.id.trait34);
        Button loyal2 = findViewById(R.id.trait37);
        Button gener2 = findViewById(R.id.trait38);
        Button next = findViewById(R.id.next11w);

        String h2 = happy2.getText().toString();
        String lv2 = loving2.getText().toString();
        String ly2 = loyal2.getText().toString();
        String g2 = gener2.getText().toString();

        happy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tes.setText(h2);
            }
        });
        loving2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tes.setText(lv2);
            }
        });
        loyal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tes.setText(ly2);
            }
        });
        gener2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tes.setText(g2);
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
            String mom = getIntent().getStringExtra("trt");
            EditText tes = findViewById(R.id.editTextab2);
            String dad = tes.getText().toString();

            Intent intent = new Intent(this, ggenerator.class);
            intent.putExtra("mom", mom);
            intent.putExtra("dad", dad);
            startActivity(intent);

        }
}