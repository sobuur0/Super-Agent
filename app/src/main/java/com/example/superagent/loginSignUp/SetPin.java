package com.example.superagent.loginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.databinding.ActivitySetPinBinding;
import com.example.superagent.home.homeScreen;

public class SetPin extends AppCompatActivity {
    private ActivitySetPinBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetPinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSetPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetPin.this, homeScreen.class);
                startActivity(intent);
            }
        });
    }
}