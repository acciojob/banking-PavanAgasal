package com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount
        BankAccount account = new BankAccount("John Doe", 0.0, 1000.0);

        try {
            account.deposit(500.0);
            System.out.println("Deposit successful. Current balance: " + account.getBalance());

            account.withdraw(200.0);
            System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("----------------------");

        // Creating a CurrentAccount
        try {
            CurrentAccount currentAccount = new CurrentAccount("Jane Smith", 1000.0, "LICENSE");

            currentAccount.deposit(1000.0);
            System.out.println("Deposit successful. Current balance: " + currentAccount.getBalance());

            currentAccount.withdraw(3000.0);
            System.out.println("Withdrawal successful. Current balance: " + currentAccount.getBalance());

            currentAccount.validateLicenseId();
            System.out.println("License ID validation successful. Trade License ID: " + currentAccount.getTradeLicenseId());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("----------------------");

        // Creating a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("Alice Johnson", 5000.0, 2000.0, 0.05);

        try {
            savingsAccount.deposit(2000.0);
            System.out.println("Deposit successful. Current balance: " + savingsAccount.getBalance());

            savingsAccount.withdraw(1500.0);
            System.out.println("Withdrawal successful. Current balance: " + savingsAccount.getBalance());

            double simpleInterest = savingsAccount.getSimpleInterest(3);
            System.out.println("Simple Interest after 3 years: " + simpleInterest);

            double compoundInterest = savingsAccount.getCompoundInterest(2, 5);
            System.out.println("Compound Interest after 5 years compounded semi-annually: " + compoundInterest);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("----------------------");

        // Creating a StudentAccount
        StudentAccount studentAccount = new StudentAccount("Bob Smith", 1000.0, "ABC University");

        try {
            studentAccount.deposit(500.0);
            System.out.println("Deposit successful. Current balance: " + studentAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
