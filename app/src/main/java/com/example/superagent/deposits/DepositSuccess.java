package com.example.superagent.deposits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.databinding.ActivityDepositSuccessBinding;
import com.example.superagent.home.HomeScreen;

public class DepositSuccess extends AppCompatActivity {
    private ActivityDepositSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDepositSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}