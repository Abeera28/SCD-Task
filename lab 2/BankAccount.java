public class BankAccount {
    private double balance;
    private String Accountholder;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        this.Accountholder = name;
        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative. Setting to zero.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return Accountholder;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid Amount Deposit");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Amount: " + amount);
        } else {
            System.out.println("Invalid Amount Entered. Transaction failed.");
        }
    }

    // Display account info
    public void displayInfo() {
        System.out.println("Account Holder: " + Accountholder);
        System.out.println("Current Balance: " + balance);
    }
}