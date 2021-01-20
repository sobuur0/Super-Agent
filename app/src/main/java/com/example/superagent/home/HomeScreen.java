package com.example.superagent.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityHomeScreenBinding;
import com.example.superagent.deposits.Deposit;
import com.example.superagent.transactions.TransactionsHistory;
import com.example.superagent.withdrawal.Withdraw;

public class HomeScreen extends AppCompatActivity {
    private ActivityHomeScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new HomeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

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