package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class whatsTheGender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_the_gender);

        TextView txt= findViewById(R.id.text1);
        txt.setText(getIntent().getStringExtra("DESCRIPTION"));

        Button boy = findViewById(R.id.buttonb);
        Button girl = findViewById(R.id.buttong);

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                girl();
            }
        });

        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boy();
            }
        });
    }

        public void girl(){

            Intent intent = new Intent(this, girl.class);
            intent.putExtra("girl", "Congratulations!!, your baby is a girl!");
            startActivity(intent);
        }

        public void boy(){//works
            Intent intent = new Intent(this, boy.class);
            intent.putExtra("boy", "Congratulations, you are having a boy!!");
            startActivity(intent);
        }
}