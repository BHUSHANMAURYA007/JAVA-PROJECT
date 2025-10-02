import java.util.UUID;

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String holderName) {
        this.accountNumber = generateAccountNumber();
        this.holderName = holderName;
        this.balance = 0.0;
    }

    private String generateAccountNumber() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit successful!");
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful!");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}
