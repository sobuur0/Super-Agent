package com.example.superagent.deposits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.superagent.databinding.ActivityDepositTransactionBinding;

public class DepositTransaction extends AppCompatActivity {
    private ActivityDepositTransactionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDepositTransactionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}