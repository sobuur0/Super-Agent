package com.example.superagent.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.superagent.databinding.ActivityHomeScreenBinding;
import com.example.superagent.deposits.Deposit;
import com.example.superagent.transactions.TransactionsHistory;
import com.example.superagent.withdrawal.Withdraw;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

        binding.transchistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeScreen.this, TransactionsHistory.class);
                startActivity(intent);
            }
        });
    }

//    private void saveCardDetails() {
//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//        FirebaseAuth auth = FirebaseAuth.getInstance();
//
//        String cardNumber = binding.edtCardNumber.getEditText().toString();
//        String cvv = binding.edtCvv.getEditText().toString();
//        String expireDate = Objects.requireNonNull(binding.edtExpireDate.getEditText()).toString();
//        String cardHolderName = Objects.requireNonNull(binding.edtCardHolderName.getEditText()).toString();
//
//        Map<String, String> card = new HashMap<>();
//        card.put("card_holder_name", cardHolderName);
//        card.put("card_number", cardNumber);
//        card.put("cvv", cvv);
//        card.put("expire_date", expireDate);
//
//        FirebaseUser currentUser = auth.getCurrentUser();
//        db.collection("card").document(currentUser.getUid())
//                .set(card)
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        Log.d("TAG", "DocumentSnapShot successfully written");
//                        Toast.makeText(AddCardDetailsActivity.this, "Card Added Successfully", Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Log.w("TAG", "Error writing document", e);
//                    }
//                });
//
//    }
}