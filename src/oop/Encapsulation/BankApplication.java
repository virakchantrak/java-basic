package oop.Encapsulation;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        BankAccountService service = new BankAccountService();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of accounts to create: ");
        BankAccount[] accounts = service.createAccounts(scanner.nextInt());
        service.transfer(accounts);
        service.print(accounts);

    }
}
