package application;

public class StudentAccount extends Account {
    protected int withdrawLimit;

    public StudentAccount(String accountNumber, String accountType, int balance, int withdrawLimit) {
        super(accountNumber, accountType, balance);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    void withdraw(int amount) {
        if (amount > withdrawLimit) {
            System.out.println("You have exceeded your withdrawal limit.");
        } else if (amount > balance) {
            System.out.println("insufficient funds on the account.");
        } else {
            setBalance(balance - amount);
            System.out.println("Successful withdraw of " + amount + " PLN");
            System.out.println(getBalance() + " PLN left on your account.");
        }
    }
}
