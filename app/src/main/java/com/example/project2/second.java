package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button yes= findViewById(R.id.button1);
        Button no = findViewById(R.id.button2);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yes();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no();
            }
        });
    }

    public void yes(){
        String description="You choose you know your baby's gender";
        Intent intent = new Intent(this, whatsTheGender.class);
        intent.putExtra("DESCRIPTION",description);
        startActivity(intent);
    }
    public void no(){
        String description="You choose you do not know your baby's gender";
        Intent intent = new Intent(this, dontKnowGender.class);
        intent.putExtra("DESCRIPTION1",description);
        startActivity(intent);
    }
}