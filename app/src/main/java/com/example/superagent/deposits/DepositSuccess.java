package com.example.superagent.deposits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.superagent.databinding.ActivityDepositSuccessBinding;

public class DepositSuccess extends AppCompatActivity {
    private ActivityDepositSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDepositSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}