package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class girl1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl1);

        Button gener = findViewById(R.id.get);

        TextView mom = findViewById(R.id.mom1a);
        TextView dad = findViewById(R.id.dad1a);

        String mm= getIntent().getStringExtra("mom");
        String dd= getIntent().getStringExtra("dad");

        mom.setText("Mom's personality is " + mm);
        dad.setText("Dad's personality is " + dd);

        gener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generator();
            }
        });
    }

    public void generator(){
        TextView mom = findViewById(R.id.mom1a);
        TextView dad = findViewById(R.id.dad1a);

        String mm= getIntent().getStringExtra("mom");
        String dd= getIntent().getStringExtra("dad");

        String girl[]={"Tanya","Simran","Katie","Sarah","Jessica","April"};

        mom.setText("Mom's personality is "+ mm);
        dad.setText("Dad's personality is "+ dd);

        if((mm.equals("Happy")) && (dd.equals("Loyal"))){

            String girl1 = girl[0];
            Intent intent = new Intent(this, girlgene.class);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
    }

}