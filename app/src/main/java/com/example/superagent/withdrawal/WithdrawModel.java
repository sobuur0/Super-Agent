package com.example.superagent.withdrawal;

public class WithdrawModel {
    private String mPhoneNumber;

    public WithdrawModel(String phoneNumber) {
        this.mPhoneNumber = phoneNumber;
    }

    public WithdrawModel() {

    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }
}
