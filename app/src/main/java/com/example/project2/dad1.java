package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class dad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad1);

        TextView txtDad= findViewById(R.id.text5);
        txtDad.setText("Hello, "+getIntent().getStringExtra("DES1"));

        Button d = findViewById(R.id.dad1);
        Button happyd = findViewById(R.id.trait5);
        Button loyald = findViewById(R.id.trait6);
        Button lovingd = findViewById(R.id.trait7);
        Button gened = findViewById(R.id.trait8);
        Button next = findViewById(R.id.nextw);
        EditText text = findViewById(R.id.editTexta2);

        happyd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String hpd = happyd.getText().toString();
               text.setText(hpd);
            }
        });

        loyald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lad = loyald.getText().toString();
                text.setText(lad);
            }
        });
        lovingd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lvd = lovingd.getText().toString();
                text.setText(lvd);
            }
        });
        gened.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ged = gened.getText().toString();
                text.setText(ged);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dadAnswer();
            }
        });
    }

    public void dadAnswer(){

        EditText text = findViewById(R.id.editTexta2);
        String da = text.getText().toString();
        Intent intent = new Intent(this, momTurn.class);
        intent.putExtra("dad", da);
        intent.putExtra("mom","Mom, its your turn.");
        startActivity(intent);
    }

}