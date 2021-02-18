package com.example.superagent.loginSignUp;

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
import com.example.superagent.databinding.FragmentSignupBinding;
import com.example.superagent.home.HomeScreenActivity;

public class SignUpFragment extends Fragment {
    private FragmentSignupBinding binding;
    private Button btnSignUp;

    public static SignUpFragment getInstance() {
        SignUpFragment signUpFragment = new SignUpFragment();
        return signUpFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_signup, container, false);

        btnSignUp = v.findViewById(R.id.signUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HomeScreenActivity.class);
                startActivity(intent);
            }
        });

        binding.txtForgotPsswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LoginFragment.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
