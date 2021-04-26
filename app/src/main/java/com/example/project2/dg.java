package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dg);

        String girl[]={"Tanya","Simran","Katie","Sarah","Jessica","April"};
        String boy[]={"Kevin","David","George","Parker","Jackson","Josh"};

        TextView mom = findViewById(R.id.moma);
        TextView dad = findViewById(R.id.dada);
        TextView g = findViewById(R.id.gbaby);
        TextView b = findViewById(R.id.bbaby);

        String d = getIntent().getStringExtra("da1");
        String m = getIntent().getStringExtra("ma");

        mom.setText("Mom's personality is "+ m);
        dad.setText("Dad's personality is "+ d);

//        if(m.equals("Happy")&&(d.equals("Loyal"))){
//            g.setText("Girl Name: "+girl[0]);
//            b.setText("Boy Name: "+ boy[2]);
//        }
    }
}