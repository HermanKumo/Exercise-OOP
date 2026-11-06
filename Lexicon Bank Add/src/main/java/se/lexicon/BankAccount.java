package se.lexicon;

public abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    //Common base class for all account types
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;

    }
    public double getBalance() {
        return balance;
    }
    //Each account type implements its own month-end ru
    public abstract void processAccount();
    //Each account type formats its own summary
    public abstract void printSummary();
    }

