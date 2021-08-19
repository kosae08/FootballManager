package com.example.startup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.sqlite.*;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText login_id_text = findViewById(R.id.login_id_text);
        EditText login_pw_text = findViewById(R.id.login_pw_text);
        Button login_btn = findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean login_flag = false;

                // Login 함수 추가 예정
                String id = login_id_text.getText().toString();
                String pw = login_pw_text.getText().toString();
                if(id.equals("dojunk")) {
                    if(pw.equals("Joker0422!")) {
                        login_flag = true;
                    }
                }

                if(login_flag) {
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}