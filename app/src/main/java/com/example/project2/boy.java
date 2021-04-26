package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class boy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy);

        TextView boy = findViewById(R.id.text2);
        boy.setText(getIntent().getStringExtra("boy"));

        Button mom = findViewById(R.id.mom1);
        Button dad = findViewById(R.id.dad1);

        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mom();
            }
        });
        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dad();
            }
        });

    }

        public void mom(){
            Button mom = findViewById(R.id.mom1);
            String mommy = mom.getText().toString();
            Intent intent = new Intent(this, mom3.class);
            intent.putExtra("mom",mommy);
            startActivity(intent);
    }

        public void dad(){
        Button dad = findViewById(R.id.dad1);
        String dad1 = dad.getText().toString();
        Intent intent = new Intent(this, bdad.class);
        intent.putExtra("dad",dad1);
        startActivity(intent);
    }
}