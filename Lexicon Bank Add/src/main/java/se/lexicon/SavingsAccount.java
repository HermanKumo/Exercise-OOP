package se.lexicon;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void processAccount() {
        double interestEarned = balance * (interestRate / 100);
        balance += interestEarned;
    }

    @Override
    public void printSummary() {
        System.out.printf("Personal account [%s] | Balance: %.2f SEK | Interest: %.1f%%\n",
                getAccountNumber(), balance, interestRate);
    }
}