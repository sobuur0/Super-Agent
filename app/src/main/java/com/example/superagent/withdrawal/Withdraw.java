package com.example.superagent.withdrawal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.databinding.ActivityWithdrawBinding;

public class Withdraw extends AppCompatActivity {
    private ActivityWithdrawBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Withdraw.this, WithdrawSuccess.class);
                startActivity(intent);
            }
        });
    }
}