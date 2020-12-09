package com.example.superagent.loginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.superagent.databinding.ActivitySetPinBinding;

public class SetPin extends AppCompatActivity {
    private ActivitySetPinBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetPinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}