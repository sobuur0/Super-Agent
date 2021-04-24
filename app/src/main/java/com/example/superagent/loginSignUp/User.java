package com.example.superagent.loginSignUp;

public class User {
    private String firstName, lastName, bankName, email, passWord;

    public User() {

    }

    public User(String firstName, String lastName, String bankName, String email, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
        this.email = email;
        this.passWord = passWord;
    }
}