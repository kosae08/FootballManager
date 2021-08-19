package com.example.startup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button player_btn = findViewById(R.id.player_btn);
        Button manager_btn = findViewById(R.id.manager_btn);
        Button fan_btn = findViewById(R.id.fan_btn);
    }
}