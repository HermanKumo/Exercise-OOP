package se.lexicon;

public class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public CheckingAccount(String accountNumber, double balance, double monthlyFee) {
        super(accountNumber, balance);
        this.monthlyFee = monthlyFee;

    }
    @Override
    public void processAccount() {
        balance -= monthlyFee;
    }
    @Override
    public void printSummary() {
        System.out.printf("Checking account [%s] | Balance: $%.2f SEK | Monthly fee: %2f SEK\n",
        getAccountNumber(), balance,monthlyFee);
    }
}
