package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bge);

        Button gener = findViewById(R.id.get);

        TextView mom = findViewById(R.id.mom1a);
        TextView dad = findViewById(R.id.dad1a);

        String mm= getIntent().getStringExtra("mom1");
        String dd= getIntent().getStringExtra("dad1");

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

        String mm= getIntent().getStringExtra("mom1");
        String dd= getIntent().getStringExtra("dad1");

        String boy[]={"Asher","David","George","Parker","Jackson","Josh","Felix","Eden","Caius","Tate",
                "Alan","Noah","James","Oliver","Lucas","Henry"};

        mom.setText("Mom's personality is "+ mm);
        dad.setText("Dad's personality is "+ dd);

        if((mm.equals("Happy")) && (dd.equals("Loyal"))){
            String boy1 = boy[2];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Happy")) && (dd.equals("Loving"))){
            String boy1 = boy[5];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Happy")) && (dd.equals("Generous"))){
            String boy1 = boy[1];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Happy")) && (dd.equals("Happy"))){
            String boy1 = boy[0];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loyal")) && (dd.equals("Loyal"))){
            String boy1 = boy[3];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loyal")) && (dd.equals("Happy"))){
            String boy1 = boy[4];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loyal")) && (dd.equals("Loving"))){
            String boy1 = boy[7];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loyal")) && (dd.equals("Generous"))){
            String boy1 = boy[9];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loving")) && (dd.equals("Loyal"))){
            String boy1 = boy[6];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loving")) && (dd.equals("Happy"))){
            String boy1 = boy[8];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loving")) && (dd.equals("Loving"))){
            String boy1 = boy[15];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Loving")) && (dd.equals("Generous"))){
            String boy1 = boy[9];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Generous")) && (dd.equals("Loyal"))){
            String boy1 = boy[10];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Generous")) && (dd.equals("Happy"))){
            String boy1 = boy[12];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Generous")) && (dd.equals("Loving"))){
            String boy1 = boy[11];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }
        if((mm.equals("Generous")) && (dd.equals("Generous"))){
            String boy1 = boy[13];
            Intent intent = new Intent(this, boyname.class);
            intent.putExtra("boy",boy1);
            startActivity(intent);
        }

    }
}