package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class toi extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi);

        textView1 = findViewById(R.id.tv_hosotoi);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView4);
        textView4 = findViewById(R.id.textView5);
        textView5 = findViewById(R.id.textView6);
        textView6 = findViewById(R.id.textView8);
        textView7 = findViewById(R.id.tv_home);
        textView8 = findViewById(R.id.tv_discover);
        textView9 = findViewById(R.id.tv_pt);
        textView10 = findViewById(R.id.tv_lichtrinh);
        textView11 = findViewById(R.id.out);

        // Thiết lập lắng nghe sự kiện cho từng TextView
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_hoso.class);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_favorite.class);
                startActivity(intent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_practice.class);
                startActivity(intent);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_setting.class);
                startActivity(intent);
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_language.class);
                startActivity(intent);
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_suppost.class);
                startActivity(intent);
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, trangchu.class);
                startActivity(intent);
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_discover.class);
                startActivity(intent);
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_trangpt1.class);
                startActivity(intent);
            }
        });

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_lichtrinh.class);
                startActivity(intent);
            }
        });

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_login.class);
                startActivity(intent);
            }
        });
    }
}