public class Main1 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Abeera", 0);
        BankAccount account2 = new BankAccount("Nadeem", 1000);

        // User 1 operations
        System.out.println("User 1: " + account1.getAccountHolder() + ", Balance: " + account1.getBalance());
        account1.deposit(0);
        account1.withdraw(200);
        account1.displayInfo();

        System.out.println();

        // User 2 operations
        System.out.println("User 2: " + account2.getAccountHolder() + ", Balance: " + account2.getBalance());
        account2.withdraw(200);
        account2.deposit(50);
        account2.displayInfo();
    }
}