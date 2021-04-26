package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;

public class dontKnowGender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dont_know_gender);

        TextView txt2 = findViewById(R.id.text2);
        txt2.setText(getIntent().getStringExtra("DESCRIPTION1"));

        Button mom1= findViewById(R.id.mom1);
        Button dad1=findViewById(R.id.dad1);

        mom1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                mom();
        }
    });
        dad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dad();
            }
        });

    }

    public void mom(){//works
        Intent intent = new Intent(this, mom1.class);
        Button mom1= findViewById(R.id.mom1);
        String m = mom1.getText().toString();
        intent.putExtra("DES",m);
        startActivity(intent);
    }
    public void dad(){//works
        Intent intent = new Intent(this, dad1.class);
        Button dad1= findViewById(R.id.dad1);
        String m = dad1.getText().toString();
        intent.putExtra("DES1",m);
        startActivity(intent);
    }

}