package com.example.gymapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fragment_trangttxoay2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv_discover;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangttxoay2);
        ImageView imageView = findViewById(R.id.xoay); // Thay "imageToanThan2" bằng ID thực sự của ImageView

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_trangttxoay2.this, fragment_trangtt.class);
                startActivity(intent);
            }
        });
    }
}
