import java.util.Scanner;
import java.util.HashMap;

public class BankSimulation {
    private static HashMap<String, BankAccount> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==== Bank Account Simulation ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank Simulator!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private static void createAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name);
        accounts.put(account.getAccountNumber(), account);
        System.out.println("✅ Account created successfully!");
        System.out.println("Your Account Number: " + account.getAccountNumber());
    }

    private static void depositMoney() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        BankAccount account = accounts.get(accNo);
        if (account != null) {
            System.out.print("Enter amount to deposit: $");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.deposit(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        BankAccount account = accounts.get(accNo);
        if (account != null) {
            System.out.print("Enter amount to withdraw: $");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.withdraw(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        BankAccount account = accounts.get(accNo);
        if (account != null) {
            account.displayDetails();
        } else {
            System.out.println("❌ Account not found.");
        }
    }
}
