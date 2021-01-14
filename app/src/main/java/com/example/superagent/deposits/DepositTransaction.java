package com.example.superagent.deposits;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityDepositTransactionBinding;

import java.util.Objects;

public class DepositTransaction extends AppCompatActivity {
    private ActivityDepositTransactionBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDepositTransactionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Drawable backArrow = ContextCompat.getDrawable(this, R.drawable.arrowback);

        setSupportActionBar(binding.toolbar);
        Objects.requireNonNull(getSupportActionBar()).setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(backArrow);
        getSupportActionBar().setTitle("");
        binding.appBarLayout.bringToFront();

        binding.btnDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DepositSuccess.class);
                startActivity(intent);
            }
        });
    }
}