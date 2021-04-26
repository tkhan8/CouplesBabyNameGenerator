package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ggenerator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ggenerator);


        TextView mom = findViewById(R.id.mom1a);
        TextView dad = findViewById(R.id.dad1a);
        TextView babyg = findViewById(R.id.gbaby);

        Button gene = findViewById(R.id.get);

        String mm1 = getIntent().getStringExtra("mom");
        String dd1 = getIntent().getStringExtra("dad");

        mom.setText("Mom's personality is "+ mm1);
        dad.setText("Dad's personality is "+ dd1);

        gene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }
        public void next(){

//            String girl[]={"Tanya","Simran","Katie","Sarah","Jessica","April"};
            TextView mom = findViewById(R.id.mom1a);
            TextView dad = findViewById(R.id.dad1a);

            String mm1 = getIntent().getStringExtra("mom");
            String dd1 = getIntent().getStringExtra("dad");

            String girl[]={"Tanya","Simran","Katie","Sarah","Jessica","April", "Olivia","Emma","Amelia","Mia",
                    "Luna","Penelope","Victoria","Zoe","Lily","Riley"};

            if((mm1.equals("Happy")) && (dd1.equals("Loyal"))){
                String girl1 = girl[0];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Happy")) && (dd1.equals("Loving"))){
                String girl1 = girl[3];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Happy")) && (dd1.equals("Generous"))){
                String girl1 = girl[1];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Happy")) && (dd1.equals("Happy"))){
                String girl1 = girl[6];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loyal")) && (dd1.equals("Loyal"))){
                String girl1 = girl[2];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loyal")) && (dd1.equals("Happy"))){
                String girl1 = girl[4];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loyal")) && (dd1.equals("Loving"))){
                String girl1 = girl[8];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loyal")) && (dd1.equals("Generous"))){
                String girl1 = girl[5];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loving")) && (dd1.equals("Loyal"))){
                String girl1 = girl[9];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loving")) && (dd1.equals("Happy"))){
                String girl1 = girl[11];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loving")) && (dd1.equals("Loving"))){
                String girl1 = girl[12];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Loving")) && (dd1.equals("Generous"))){
                String girl1 = girl[14];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Generous")) && (dd1.equals("Loyal"))){
                String girl1 = girl[15];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Generous")) && (dd1.equals("Happy"))){
                String girl1 = girl[13];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Generous")) && (dd1.equals("Loving"))){
                String girl1 = girl[7];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }
            if((mm1.equals("Generous")) && (dd1.equals("Generous"))){
                String girl1 = girl[10];
                Intent intent = new Intent(this, girlService.class);
                intent.putExtra("girl",girl1);
                startActivity(intent);
            }

        }

}