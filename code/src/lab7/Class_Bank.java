package lab7;

import java.util.Scanner;

class Bank_Account {
    String account_no;
    String user_name;
    String account_type;
    double account_balance;
    Scanner sc = new Scanner(System.in);

    public void getAccountDetails() {
        System.out.print("Enter account number : ");
        account_no = sc.nextLine();
        System.out.print("Enter user name : ");
        user_name = sc.nextLine();
        System.out.print("Enter account type : ");
        account_type = sc.nextLine();
        System.out.print("Enter account balance : ");
        account_balance = sc.nextDouble();
    }

    public void displayAccountDetails() {
        System.out.println("\nBank account details");
        System.out.println("Account number : " + account_no);
        System.out.println("User name : " + user_name);
        System.out.println("Account type : " + account_type);
        System.out.println("Account balance : " + account_balance);
    }
}

public class Class_Bank {
    public static void main(String[] args) {
        Bank_Account acc1 = new Bank_Account();
        acc1.getAccountDetails();
        acc1.displayAccountDetails();
    }
}
