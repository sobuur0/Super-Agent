package com.example.superagent.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.superagent.R;
import com.example.superagent.databinding.FragmentSignupBinding;
import com.example.superagent.home.HomeScreenActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class SignUpFragment extends Fragment {
    private FirebaseAuth mAuth;
    private FragmentSignupBinding binding;
    private Button btnSignUp;
    private TextView txtForgotPsswd;
    private TextInputLayout edtTextEmail, edtTextPassword, edtTextlastName, edtTextfirstName, edtTextbankName;

    public static SignUpFragment getInstance() {
        SignUpFragment signUpFragment = new SignUpFragment();
        return signUpFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_signup, container, false);

        edtTextEmail = v.findViewById(R.id.edtText_email_signUp);
        edtTextPassword = v.findViewById(R.id.edtText_passwd_signUp);
        edtTextlastName = v.findViewById(R.id.edtText_lastName_signUp);
        edtTextfirstName = v.findViewById(R.id.edtText_firstName_signUp);
        edtTextbankName = v.findViewById(R.id.edtText_bankName_signUp);

        btnSignUp = v.findViewById(R.id.signUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
//                Intent intent = new Intent(getActivity(), HomeScreenActivity.class);
//                startActivity(intent);
            }
        });

        txtForgotPsswd = v.findViewById(R.id.txt_forgot_psswd);
        txtForgotPsswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LoginSignUpActivity.class);
                startActivity(intent);
            }
        });



        return v;
    }

    private void registerUser() {
        final String email = Objects.requireNonNull(edtTextEmail.getEditText()).toString().trim();
        final String password = Objects.requireNonNull(edtTextPassword.getEditText()).toString().trim();
        final String lastName = Objects.requireNonNull(edtTextlastName.getEditText()).toString().trim();
        final String firstName = Objects.requireNonNull(edtTextfirstName.getEditText()).toString().trim();
        final String bankName = Objects.requireNonNull(edtTextbankName.getEditText()).toString().trim();

        if(!firstName.isEmpty()) {
            edtTextfirstName.setError("Kindly enter your First Name");
            edtTextfirstName.requestFocus();
            return;
        }
        if (!bankName.isEmpty()) {
            edtTextbankName.setError("Kindly enter your bank Name");
            edtTextbankName.requestFocus();
            return;
        }
        if (!lastName.isEmpty()) {
            edtTextlastName.setError("Kindly Enter you last Name");
            edtTextlastName.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtTextEmail.setError("Kindly enter your password");
            edtTextEmail.requestFocus();
            return;
        }
        if (!(password.length() < 6)) {
            edtTextPassword.setError("Kindly enter your password");
            edtTextPassword.requestFocus();
            return;
        }

    }
}
