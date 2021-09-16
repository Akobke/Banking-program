package com.company;

public class debitAccount extends bankAccount{
    public double deposit(double depositAmmount){
        balance = this.balance + depositAmmount - (depositAmmount * .05);
        return balance;
    }
    public double withdraw(double depositAmmount){
        double testBalance = this.balance - depositAmmount;
        if(testBalance <= 0){
            System.out.println("Can not withdraw a ammount more than current balance, please try a smaller ammount");
        }
        else{
            balance = this.balance + depositAmmount - (depositAmmount * .05);
        }
        return balance;
    }
}
