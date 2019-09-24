package com.atm;

import java.util.Scanner;

public class UI {
   private Scanner sc=new Scanner(System.in);
   private ATM atm=new ATM();

    public void showMenue(){

        while(true){
            System.out.println("=====ATM=====");
            System.out.println("=============");
            System.out.println("1 to check balance");
            System.out.println("2 to deposit");
            System.out.println("3 to Withdraw");
            System.out.println("4 exit");
            System.out.println("Choice> ");
            byte choice=sc.nextByte();
            switch (choice){
                case 1:
                    checkbalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect options");
            }
        }


    }


    private void checkbalance(){
        System.out.println("Your balance is "+atm.getBalance());

    }
    private void deposit(){
    System.out.println("Enter Amount to deposit ");
    double amount=sc.nextDouble();
    atm.deposit(amount);
    }

    private void withdraw(){

        System.out.println("Enter Amount to withdraw ");
        double amount=sc.nextDouble();
        atm.withDraw(amount);

    }

    public static void main(String args[]){
        UI ui=new UI();
        ui.showMenue();
    }
}

