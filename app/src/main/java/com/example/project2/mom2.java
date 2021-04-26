package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mom2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom2);
        TextView b = findViewById(R.id.text2);
        b.setText("Hello Mom, it's your turn!");

        String dad = getIntent().getStringExtra("dad");

        Button happy1 = findViewById(R.id.trait1);
        Button loving1 = findViewById(R.id.trait2);
        Button loyal1 = findViewById(R.id.trait3);
        Button gener1 = findViewById(R.id.trait4);

        String h1 = happy1.getText().toString();
        String lv1 = loving1.getText().toString();
        String ly1 = loyal1.getText().toString();
        String g1 = gener1.getText().toString();

        EditText text = findViewById(R.id.edittext);

        happy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(h1);
            }
        });
        loving1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(lv1);
            }
        });
        loyal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(ly1);
            }
        });
        gener1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(g1);
            }
        });

        Button next=findViewById(R.id.next1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dad1();
            }
        });
    }

    public void dad1(){
        EditText text= findViewById(R.id.edittext);
        String dad = getIntent().getStringExtra("dad");
        String mom = text.getText().toString();
        Intent intent = new Intent(this, ggenerator.class);
        intent.putExtra("dad",dad);
        intent.putExtra("mom",mom);
        startActivity(intent);

    }

}
