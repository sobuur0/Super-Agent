package com.example.superagent.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.databinding.ActivityHomeScreenBinding;
import com.example.superagent.deposits.Deposit;
import com.example.superagent.withdrawal.Withdraw;

public class homeScreen extends AppCompatActivity {
    private ActivityHomeScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.cardDeposits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeScreen.this, Deposit.class);
                startActivity(intent);
            }
        });

        binding.cardWithdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeScreen.this, Withdraw.class);
                startActivity(intent);
            }
        });
    }
}