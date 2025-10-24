package oop.Encapsulation;

import java.util.Scanner;

public class BankAccountService {

    public BankAccount[] createAccounts(int n) {
        BankAccount[] accounts = new BankAccount[n];
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account: " + (i + 1));
            accounts[i] = createAccount();
        }
        return accounts;
    }

    public void print(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Owner Name: " + account.getOwnerName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("-------------------------");
        }
    }

    private BankAccount createAccount() {
        String accountNumber = getString("Enter Account Number: ");
        String ownerName = getString("Enter Owner Name: ");
        double balance = getDouble("Enter Initial Balance: ");
        return new BankAccount(accountNumber, ownerName, balance);
    }

    public void transfer(BankAccount[] accounts) {
        String fromAccNo = getString("Enter sender account number: ");
        String toAccNo = getString("Enter receiver account number: ");
        double amount = getDouble("Enter amount to transfer: ");

        BankAccount from = findAccount(accounts, fromAccNo);
        BankAccount to = findAccount(accounts, toAccNo);

        if (from == null || to == null) {
            System.out.println("❌ One or both accounts not found!");
            return;
        }

        if (amount <= 0) {
            System.out.println("❌ Invalid amount!");
            return;
        }

        if (from.getBalance() < amount) {
            System.out.println("❌ Insufficient funds in " + from.getOwnerName() + "'s account.");
            return;
        }

        from.withdraw(amount);
        to.deposit(amount);

        System.out.println("✅ Transferred $" + amount + " from " + from.getOwnerName() +
                " to " + to.getOwnerName());
    }

    private BankAccount findAccount(BankAccount[] accounts, String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    private static String getString(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static double getDouble(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
