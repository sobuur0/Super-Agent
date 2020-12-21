package com.example.superagent.withdrawal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.superagent.databinding.ActivityWithdrawSuccessBinding;

public class WithdrawSuccess extends AppCompatActivity {

    private ActivityWithdrawSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}