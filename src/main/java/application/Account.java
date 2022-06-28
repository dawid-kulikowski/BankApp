package application;

import java.util.Scanner;

public class Account {
    protected String accountNumber;
    protected String accountType;
    protected int balance;

    public Account(String accountNumber, String accountType, int balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    void deposit (int amount) {
        if (amount > 0) {
            this.balance+=amount;        }
    }

    void withdraw (int amount) {
        if (amount <= balance && amount > 0) {
            this.balance-=amount;
            System.out.println("Successful withdraw of " + amount + " PLN");
            System.out.println(getBalance() + " PLN left on your account.");
        }
    }
}
