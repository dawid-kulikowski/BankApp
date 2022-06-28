package application;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountType, int balance, double interestRate) {
        super(accountNumber, accountType, balance);
        this.interestRate = interestRate;
    }


    void locate(int amount) {



    }

}
