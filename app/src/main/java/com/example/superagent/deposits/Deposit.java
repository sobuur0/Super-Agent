package com.example.superagent.deposits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.superagent.databinding.ActivityDepositBinding;

public class Deposit extends AppCompatActivity {

    private ActivityDepositBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDepositBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}