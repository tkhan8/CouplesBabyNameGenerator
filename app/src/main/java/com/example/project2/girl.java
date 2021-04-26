package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class girl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl);

        TextView girl = findViewById(R.id.textg2);
        girl.setText(getIntent().getStringExtra("girl"));

        Button mom = findViewById(R.id.mom2);
        Button dad = findViewById(R.id.dad2);

        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qm();
            }
        });
        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qd();
            }
        });
    }
        public void qm(){
            Button mom = findViewById(R.id.mom2);
            String qmom = mom.getText().toString();
            Intent intent = new Intent(this, qm.class);
            intent.putExtra("mom",qmom);
            startActivity(intent);
        }

        public void qd(){
            Button dad = findViewById(R.id.dad2);
            String qdad = dad.getText().toString();
            Intent intent = new Intent(this, dad4.class);
            intent.putExtra("dad", qdad);
            startActivity(intent);
        }
}