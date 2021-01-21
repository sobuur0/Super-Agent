package com.example.superagent.loginSignUp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityLoginActivtyBinding;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LoginSignUpActivity extends AppCompatActivity {

    private ActivityLoginActivtyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginActivtyBinding.inflate(getLayoutInflater());
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