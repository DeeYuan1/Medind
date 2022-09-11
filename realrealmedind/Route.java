package com.example.realrealmedind;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.realrealmedind.databinding.ActivityRouteBinding;

public class Route extends AppCompatActivity {

    Button next_btn;
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        next_btn = findViewById(R.id.nextbtn);
        next_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Route.this, Route2.class);
                        startActivity(i);
                    }
                }
        );

        back_btn = findViewById(R.id.backbtn);
        back_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Route.this, HospitalInfo.class);
                        startActivity(i);
                    }
                }
        );
    }
}