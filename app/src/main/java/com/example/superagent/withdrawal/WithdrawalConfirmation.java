package com.example.superagent.withdrawal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityWithdrawalConfirmationBinding;

import java.util.Objects;

public class WithdrawalConfirmation extends AppCompatActivity {
    private ActivityWithdrawalConfirmationBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawalConfirmationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Drawable backArrow = ContextCompat.getDrawable(this, R.drawable.arrowbackblue);

        setSupportActionBar(binding.toolbar);
        Objects.requireNonNull(getSupportActionBar()).setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(backArrow);
        getSupportActionBar().setTitle("");
        binding.appBarLayout.bringToFront();

        binding.btnWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WithdrawalSuccessful.class);
                startActivity(intent);
            }
        });
    }
}