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

public class PorscheActivity extends AppCompatActivity {

    Button bp1,bp2,bp3,bp4,bp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_porsche);

        bp1 = findViewById(R.id.bp1);
        bp2 = findViewById(R.id.bp2);
        bp3 = findViewById(R.id.bp3);
        bp4 = findViewById(R.id.bp4);
        bp5 = findViewById(R.id.bp5);
        Klick();

    }

    void  Klick(){
        bp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(PorscheActivity.this, P911t3rsActivity.class);
                startActivity(bugatti);
            }
        });

        bp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(PorscheActivity.this, P718gt4rs.class);
                startActivity(bugatti);
            }
        });

        bp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(PorscheActivity.this, P911carreraActivity.class);
                startActivity(bugatti);
            }
        });

        bp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(PorscheActivity.this, P718spyderrsActivity.class);
                startActivity(bugatti);
            }
        });

        bp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugatti =new Intent(PorscheActivity.this, PtaycanActivity.class);
                startActivity(bugatti);
            }
        });
    }

}