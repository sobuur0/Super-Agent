package com.example.superagent.transactions;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityTransactionsHistoryBinding;
import com.example.superagent.databinding.FragmentTransactionsHistoryBinding;

import java.util.Objects;

public class TransactionsHistory extends AppCompatActivity {
    private ActivityTransactionsHistoryBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransactionsHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_transactions_history);
        if (fragment == null) {
            fragment = new TransactionFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_transactions_history, fragment)
                    .commit();
        }



    }
}