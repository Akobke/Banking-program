package com.company;

public class bankAccount {
    double balance;
    public bankAccount(){
        balance = 0;
    }
    public bankAccount(double newAccountDeposit) {
        balance = newAccountDeposit;
    }
    public double deposit(double depositAmmount){
        balance = this.balance + depositAmmount;
        return balance;
    }
    public double withdraw(double depositAmmount){
        double testBalance = this.balance - depositAmmount;
        if(testBalance <= 0){
            System.out.println("Can not withdraw a ammount more than current balance, please try a smaller ammount");
        }
        else{
            balance = this.balance - depositAmmount;
        }
        return balance;
    }
    public double getBalance() {
        return balance;
    }
}
