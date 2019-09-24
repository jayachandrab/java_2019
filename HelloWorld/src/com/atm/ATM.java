package com.atm;
/**
Create an ATM with the following features:
- Deposit Funds.
- Withdraw Funds.
- Check Balance.
- Exit.
 */
public class ATM {

    private double balance;

    public void deposit(double amout){
        balance=balance+amout;

    }
    public void withDraw(double amount){
        if(amount<balance){
            balance=balance-amount;
        }else{
            System.out.println("In sufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }
}
