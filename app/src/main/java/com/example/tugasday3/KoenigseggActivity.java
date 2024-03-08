package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KoenigseggActivity extends AppCompatActivity {

    Button bk1, bk2, bk3, bk4, bk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_koenigsegg);

        bk1 = findViewById(R.id.bk1);
        bk2 = findViewById(R.id.bk2);
        bk3 = findViewById(R.id.bk3);
        bk4 = findViewById(R.id.bk4);
        bk5 = findViewById(R.id.bk5);
        Klick();
    }

    void Klick() {
        bk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent koenigsegg = new Intent(KoenigseggActivity.this, KageraActivity.class);
                startActivity(koenigsegg);
            }
        });

        bk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent koenigsegg = new Intent(KoenigseggActivity.this, KagerarsActivity.class);
                startActivity(koenigsegg);
            }
        });

        bk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent koenigsegg = new Intent(KoenigseggActivity.this, KjeskoActivity.class);
                startActivity(koenigsegg);
            }
        });

        bk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent koenigsegg = new Intent(KoenigseggActivity.this, KregeraActivity.class);
                startActivity(koenigsegg);
            }
        });

        bk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent koenigsegg = new Intent(KoenigseggActivity.this, KoneActivity.class);
                startActivity(koenigsegg);
            }
        });
    }
}