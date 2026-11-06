package se.lexicon;

public class LoanAccount extends BankAccount {
    private double interestRate;


    public LoanAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;

    }
    @Override
    public void processAccount() {
        double interestCharged = balance * (interestRate / 100);
        balance += interestCharged;
    }
    @Override
    public void printSummary(){
        System.out.printf("Loan account [%s] | Debt: %.2f SEK | Interest: %.1f%%\n",
                getAccountNumber(), balance, interestRate);
    }
}
