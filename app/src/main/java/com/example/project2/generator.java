package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class generator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);

//        String girl[]={"Tanya","Simran","Katie","Sarah","Jessica","April"};
//        String boy[]={"Kevin","David","George","Parker","Jackson","Josh"};

        TextView mm = findViewById(R.id.textb2);
        TextView dd = findViewById(R.id.textb3);
        Button gene=findViewById(R.id.gene);

        String mm1= getIntent().getStringExtra("mom1");
        String dd1= getIntent().getStringExtra("dad1");

        mm.setText("Mother's Personality is "+ mm1);
        dd.setText("Father's Personality is "+ dd1);

        gene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainGen();
            }
        });

    }
    public void mainGen(){
        TextView mm = findViewById(R.id.textb2);
        TextView dd = findViewById(R.id.textb3);

        String mm1= getIntent().getStringExtra("mom1");
        String dd1= getIntent().getStringExtra("dad1");

        String boy[]={"Asher","David","George","Parker","Jackson","Josh","Felix","Eden","Caius","Tate",
                "Alan","Noah","James","Oliver","Lucas","Henry"};

        String girl[]={"Tanya","Simran","Katie","Sarah","Jessica","April", "Olivia","Emma","Amelia","Mia",
                "Luna","Penelope","Victoria","Zoe","Lily","Riley"};

        if((mm1.equals("Happy")) && (dd1.equals("Loyal"))){
            String boy1 = boy[2];
            String girl1 = girl[0];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Happy")) && (dd1.equals("Loving"))){
            String boy1 = boy[5];
            String girl1 = girl[3];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Happy")) && (dd1.equals("Generous"))){
            String boy1 = boy[1];
            String girl1 = girl[1];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Happy")) && (dd1.equals("Happy"))){
            String boy1 = boy[0];
            String girl1 = girl[6];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loyal")) && (dd1.equals("Loyal"))){
            String boy1 = boy[3];
            String girl1 = girl[2];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loyal")) && (dd1.equals("Happy"))){
            String boy1 = boy[4];
            String girl1 = girl[4];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loyal")) && (dd1.equals("Loving"))){
            String boy1 = boy[7];
            String girl1 = girl[8];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loyal")) && (dd1.equals("Generous"))){
            String boy1 = boy[9];
            String girl1 = girl[5];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loving")) && (dd1.equals("Loyal"))){
            String boy1 = boy[6];
            String girl1 = girl[9];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loving")) && (dd1.equals("Happy"))){
            String boy1 = boy[8];
            String girl1 = girl[11];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loving")) && (dd1.equals("Loving"))){
            String boy1 = boy[15];
            String girl1 = girl[12];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Loving")) && (dd1.equals("Generous"))){
            String boy1 = boy[9];
            String girl1 = girl[14];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Generous")) && (dd1.equals("Loyal"))){
            String boy1 = boy[10];
            String girl1 = girl[15];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Generous")) && (dd1.equals("Happy"))){
            String boy1 = boy[12];
            String girl1 = girl[13];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Generous")) && (dd1.equals("Loving"))){
            String boy1 = boy[11];
            String girl1 = girl[7];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }
        if((mm1.equals("Generous")) && (dd1.equals("Generous"))){
            String boy1 = boy[13];
            String girl1 = girl[10];
            Intent intent = new Intent(this, name.class);
            intent.putExtra("boy",boy1);
            intent.putExtra("girl",girl1);
            startActivity(intent);
        }


    }
}