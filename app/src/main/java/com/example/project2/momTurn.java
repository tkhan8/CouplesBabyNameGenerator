package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class momTurn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom_turn);

        TextView m = findViewById(R.id.momIntro);
        TextView d = findViewById(R.id.dadans);
        EditText text = findViewById(R.id.editTextd2);
        String dA = getIntent().getStringExtra("dad");
        m.setText(getIntent().getStringExtra("mom"));
        d.setText("Dad chose: " + dA);

        Button happypm = findViewById(R.id.trait9);
        Button loyalm = findViewById(R.id.trait10);
        Button lovingm = findViewById(R.id.trait11);
        Button genem = findViewById(R.id.trait12);
        Button next = findViewById(R.id.nxt1);

        happypm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hpm = happypm.getText().toString();
                text.setText(hpm);
            }
        });
        loyalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lym = loyalm.getText().toString();
                text.setText(lym);
            }
        });
        lovingm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lvm = lovingm.getText().toString();
                text.setText(lvm);
            }
        });
        genem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gnm = genem.getText().toString();
                text.setText(gnm);
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

            String dA = getIntent().getStringExtra("dad");
            EditText text = findViewById(R.id.editTextd2);
            String mA = text.getText().toString();

            Intent intent = new Intent(this, generator.class);
            intent.putExtra("dad1", dA);
            intent.putExtra("mom1",mA);
            startActivity(intent);
        }
    }
