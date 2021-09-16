package com.company;

public class savingAccount extends bankAccount{
    public double calculateIntersest(){
        balance = balance + (balance * .04);
        return balance;
    }
}
