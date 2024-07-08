import java.util.*;

class Bank_Account {
    int actNo;
    double balance;
    String name;

    Bank_Account() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        actNo = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Balance : ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance = balance - amount;
        System.out.println("Amount Withdrawn successfully");
    }
}

public class Bank_Accounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank_Account account = new Bank_Account();

        System.out.print("Enter amount to withdraw : ");
        double amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.print("Enter amount to deposit : ");
        amount = sc.nextDouble();
        account.deposit(amount);
    }
}
