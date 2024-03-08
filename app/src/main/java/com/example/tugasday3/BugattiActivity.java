package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BugattiActivity extends AppCompatActivity {


    Button bb1,bb2,bb3,bb4,bb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bugatti);

        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bb3 = findViewById(R.id.bb3);
        bb4 = findViewById(R.id.bb4);
        bb5 = findViewById(R.id.bb5);
        Klick();
    }

    void  Klick(){
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent bugatti =new Intent(BugattiActivity.this, BveyronActivity.class);
            startActivity(bugatti);
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(BugattiActivity.this, BchironActivity.class);
                startActivity(bugatti);
            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(BugattiActivity.this, BdivoActivity.class);
                startActivity(bugatti);
            }
        });

        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(BugattiActivity.this, BlavoiturenoireActivity.class);
                startActivity(bugatti);
            }
        });

        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(BugattiActivity.this, BcentodieciActivity.class);
                startActivity(bugatti);
            }
        });
    }

}