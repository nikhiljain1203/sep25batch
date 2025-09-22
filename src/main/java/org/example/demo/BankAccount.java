package org.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;
    private String ownerName;
    private List<String> transactionHistory;

    public BankAccount() {
        this.ownerName = "Unknown";
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public BankAccount(String name, double initialBalance) {
        this.ownerName = name;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        System.out.println("Bank account created for " + ownerName + " with initial balance " + balance);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(ownerName + " deposited " + amount + ". New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for " + ownerName);
        }
    }

    public void showBal() {
        System.out.println(ownerName + "'s current balance: " + balance);
    }
}
