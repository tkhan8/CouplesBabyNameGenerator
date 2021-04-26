package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dad2nogender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad2nogender);

        TextView text1=findViewById(R.id.texta2);
        text1.setText(getIntent().getStringExtra("dad"));

        TextView text2=findViewById(R.id.texta3);
        String m = getIntent().getStringExtra("mom1");
        text2.setText("Mother chose: "+ m);


        Button happy2=findViewById(R.id.trait1_1);
        Button loving2=findViewById(R.id.trait2_1);
        Button loyal2=findViewById(R.id.trait3_1);
        Button gener2=findViewById(R.id.trait4_1);

        String h2 = happy2.getText().toString();
        String lv2 = loving2.getText().toString();
        String ly2 = loyal2.getText().toString();
        String g2 = gener2.getText().toString();

        EditText d= findViewById(R.id.edittext1_1);

        Button next2=findViewById(R.id.next2);

        happy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.setText(h2);
            }
        });
        loving2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.setText(lv2);
            }
        });
        loyal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.setText(ly2);
            }
        });
        gener2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.setText(g2);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generator();
            }
        });
    }
    public void generator(){
        EditText d= findViewById(R.id.edittext1_1);
        String m = getIntent().getStringExtra("mom1");
        String dd = d.getText().toString();

        Intent intent= new Intent(this, generator.class);
        intent.putExtra("mom1",m);
        intent.putExtra("dad1",dd);
        startActivity(intent);
    }
}