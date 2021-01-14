package com.example.superagent.deposits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.databinding.ActivityDepositTransactionBinding;

public class DepositTransaction extends AppCompatActivity {
    private ActivityDepositTransactionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDepositTransactionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DepositSuccess.class);
                startActivity(intent);
            }
        });
    }
}