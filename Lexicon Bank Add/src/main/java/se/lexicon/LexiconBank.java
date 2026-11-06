package se.lexicon;

import java.util.List;
import java.util.ArrayList;

public class LexiconBank {
    private List<BankAccount> accounts;

    public LexiconBank() {
        this.accounts = new ArrayList<>();
    }
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void processAllAccounts() {
        for (BankAccount account : accounts) {
            account.processAccount();
        }
    }

    public void printAllSummaries(){
        for (BankAccount account : accounts) {
            account.printSummary();
        }
    }
}
