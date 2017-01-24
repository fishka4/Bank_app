package com.bank_app;


public class SavingAccount {
    private double balance;
    protected int rateOfInterest;

    public SavingAccount(){
        balance = 0;
        rateOfInterest = 0;
    }

    public  SavingAccount(double balance){
        this.balance = balance;
        if(this.balance <= 0){
            rateOfInterest = 0;
        }
        if(this.balance > 0 && this.balance < 100){
            rateOfInterest = 3;
        }
        if(this.balance >= 100 && this.balance < 1000){
            rateOfInterest = 5;
        }
        if(this.balance >= 1000){
            rateOfInterest = 7;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
        if(this.balance <= 0){
            rateOfInterest = 0;
        }
        if(this.balance > 0 && this.balance < 100){
            rateOfInterest = 3;
        }
        if(this.balance >= 100 && this.balance < 1000){
            rateOfInterest = 5;
        }
        if(this.balance >= 1000){
            rateOfInterest = 7;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }
}
