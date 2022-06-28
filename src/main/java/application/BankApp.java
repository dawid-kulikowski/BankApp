package application;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bank Accounts App");

        Account account1 = new SavingAccount("123123123", "Saving Account", 2500, 1.5);
        Account account2 = new StudentAccount("456456456", "Student Account", 1000, 500);
        Account account3 = new CurrencyAccount("789789789", "Student Account", 1000);

        // Saving Withdraw
        account1.withdraw(1000);
        // Student Withdraw
        account2.withdraw(400);

        Account[] accounts = new Account[3];
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;

        for (Account acc : accounts) {
            System.out.println(acc.getBalance());
        }
    }
}
