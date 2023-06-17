package com.driver;

import java.util.Random;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        int currentSum = 0;

        for (int i = 0; i < digits; i++) {
            int digit = random.nextInt(10);
            accountNumber.append(digit);
            currentSum += digit;
        }

        if (currentSum != sum) {
            throw new Exception("Account Number cannot be generated");
        }

        return accountNumber.toString();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance - amount < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }
}
