package com.example.realrealmedind;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        login_btn = findViewById(R.id.loginbtn);
        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                }
        );
        login_btn.setOnClickListener(view -> {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Intent i = new Intent(MainActivity.this, HospitalInfo.class);
                startActivity(i);
            } else
            Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();

        });

    }
}