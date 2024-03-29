package com.example.superagent.transactions;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.superagent.R;
import com.example.superagent.databinding.FragmentTransactionsHistoryBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.Objects;

public class TransactionFragment extends Fragment {
    private MaterialToolbar mToolbar;
    private AppBarLayout mAppBarLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_transactions_history, container, false);

        Drawable backArrow = ContextCompat.getDrawable(getContext(), R.drawable.arrowback);

        mToolbar = v.findViewById(R.id.toolbar);
        mAppBarLayout = v.findViewById(R.id.appBarLayout);

        ((TransactionsHistory)getActivity()).setSupportActionBar(mToolbar);
        Objects.requireNonNull(((TransactionsHistory)getActivity()).getSupportActionBar()).setHomeButtonEnabled(true);
        ((TransactionsHistory)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TransactionsHistory)getActivity()).getSupportActionBar().setHomeAsUpIndicator(backArrow);
        ((TransactionsHistory)getActivity()).getSupportActionBar().setTitle("");
        mAppBarLayout.bringToFront();

        return v;
    }
}
