package com.example.superagent.loginSignUp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityLoginSignupBinding;

public class LoginSignUpActivity extends AppCompatActivity {

    private ActivityLoginSignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginSignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.loginSignUp_fragment_container);
        if (fragment == null) {
            fragment =new  LoginFragment();
            fm.beginTransaction()
                    .add(R.id.loginSignUp_fragment_container, fragment)
                    .commit();
        }
    }


}