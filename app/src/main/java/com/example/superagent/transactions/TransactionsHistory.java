package com.example.superagent.transactions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.superagent.databinding.ActivityTransactionsHistoryBinding;

public class TransactionsHistory extends AppCompatActivity {
    private ActivityTransactionsHistoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransactionsHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}