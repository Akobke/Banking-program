package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Boolean keepgoing = true;
        boolean goodWithdrawl = false;
        double prevBal;
        double inputValue;
        Scanner scnr = new Scanner(System.in);
        savingAccount savings = new savingAccount();
        debitAccount debit = new debitAccount();
        cls cls = new cls();
        while(keepgoing) {
	    System.out.println("Please Choose a action, 1:Deposit, 2:Withdraw, 3: Check Balance");
	    input = scnr.nextLine();
            if (input.equals("1")) {
                System.out.println("Which account would you like to deposit to? 1:Checking, 2:Savings");
                input = scnr.nextLine();
                if(input.equals("1")){
                    System.out.println("Please enter the ammount that you would like to deposit (5% convienience fee)");
                    input = scnr.nextLine();
                    inputValue = Double.parseDouble(input);
                    debit.deposit(inputValue);
                }
                else if(input.equals("2")){
                    System.out.println("Please enter the ammount that you would like to deposit:");
                    input = scnr.nextLine();
                    inputValue = Double.parseDouble(input);
                    savings.deposit(inputValue);
                }
            } else if (input.equals("2")) {
                System.out.println("Which account would you like to withdraw from? 1:Checking, 2:Savings");
                input = scnr.nextLine();
                while(!goodWithdrawl){
                    if (input.equals("1")) {
                        System.out.println("Please enter the ammount that you would like to withdraw (5% convienience fee)");
                        input = scnr.nextLine();
                        prevBal = debit.getBalance();
                        inputValue = Double.parseDouble(input);
                        debit.withdraw(inputValue);
                        if(debit.getBalance() != prevBal){
                            goodWithdrawl = true;
                        }
                    } else if (input.equals("2")) {
                        System.out.println("Please enter the ammount that you would like to withdraw:");
                        input = scnr.nextLine();
                        prevBal = debit.getBalance();
                        inputValue = Double.parseDouble(input);
                        savings.withdraw(inputValue);
                        if(savings.getBalance() != prevBal){
                            System.out.println("this is a good withdrawl");
                            goodWithdrawl = true;
                        }
                    }
                }
            }
            else if(input.equals("3")){
                System.out.println("Your current balance is: Checking: $" + debit.getBalance() + " Savings: $" + savings.getBalance());
            }
            else {
                System.out.println("Invalid Input, please press enter.");
                scnr.nextLine();
            }
            System.out.println("Your current balance is: Checking: $" + debit.getBalance() + " Savings: $" + savings.getBalance());
            System.out.println("Press enter to move to a new day, and calculate interest on savings balance");
            savings.calculateIntersest();
            scnr.nextLine();
            goodWithdrawl = false;
        }
    }
}

