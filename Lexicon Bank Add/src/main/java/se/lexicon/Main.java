package se.lexicon;

import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        // Create the bank Lexicon Bank
        LexiconBank bank = new LexiconBank();

        //Add the three accounts with starting values
        bank.addAccount(new SavingsAccount("SAV-001", 1000.0, 2.0));
        bank.addAccount(new CheckingAccount("CHK-002", 500.0, 25.0));
        bank.addAccount(new LoanAccount("LON-003", 5000.0, 3.0));

        // Print the opening balances
        System.out.println("=== OPENING BALANCES ===");
        bank.printAllSummaries();
        System.out.println();

        //Run the month-end rules (interest and fees are applied)
        System.out.println("--- Processing month-end (processAllAccounts) ---");
        bank.processAllAccounts();
        System.out.println();

        //Print the updated balances
        System.out.println("=== UPDATED BALANCES ===");
        bank.printAllSummaries();
    }
}
