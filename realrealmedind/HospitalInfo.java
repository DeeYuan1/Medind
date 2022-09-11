package com.example.realrealmedind;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

public class HospitalInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_info);

        ImageButton Navigation = findViewById(R.id.Navigation);
        Navigation.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(HospitalInfo.this,Route.class);
                        startActivity(i);
                    }
                }
        );

    }
}