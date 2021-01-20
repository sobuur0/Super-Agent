package com.example.superagent.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.superagent.R;
import com.example.superagent.deposits.Deposit;
import com.example.superagent.transactions.TransactionsHistory;
import com.example.superagent.withdrawal.Withdraw;

public class HomeFragment extends Fragment {
    private Button mCardDeposits;
    private Button mCardWithdrawal;
    private Button mTransHistory;
    private Button mCardSupport;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_screen, container, false);

        mCardDeposits = v.findViewById(R.id.card_deposits);
        mCardDeposits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Deposit.class);
                startActivity(intent);
            }
        });

        mCardWithdrawal = v.findViewById(R.id.card_withdrawal);
        mCardWithdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Withdraw.class);
                startActivity(intent);
            }
        });

        mTransHistory = v.findViewById(R.id.transchistory);
        mTransHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TransactionsHistory.class);
                startActivity(intent);
            }
        });

        mCardSupport = v.findViewById(R.id.card_support);
        mCardSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
