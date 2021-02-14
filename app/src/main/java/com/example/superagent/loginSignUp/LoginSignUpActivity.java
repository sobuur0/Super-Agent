package com.example.superagent.loginSignUp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.superagent.R;
import com.example.superagent.databinding.ActivityLoginSignupBinding;
import com.google.android.material.tabs.TabLayout;

public class LoginSignUpActivity extends AppCompatActivity {

    private ActivityLoginSignupBinding binding;
    private ViewPager viewpager;
    private TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginSignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(LoginFragment.getInstance(), "Login");
        viewPagerAdapter.addFragment(SignUpFragment.getInstance(), "SignUp");

        viewpager = findViewById(R.id.viewPager);
        tablayout = findViewById(R.id.tabs_layout);

        viewpager.setAdapter(viewPagerAdapter);

        tablayout.setupWithViewPager(viewpager);

//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.loginSignUp_fragment_container);
//        if (fragment == null) {
//            fragment =new  LoginFragment();
//            fm.beginTransaction()
//                    .add(R.id.loginSignUp_fragment_container, fragment)
//                    .commit();
//        }


//        if (fragment != null) {
//            fragment = new SignUpFragment();
//            fm.beginTransaction()
//                    .add(R.id.loginSignUp_fragment_container, fragment)
//                    .commit();
//        }
    }


}