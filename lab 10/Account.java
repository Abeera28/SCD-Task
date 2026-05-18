public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("You cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance = balance - amount;
        System.out.println("New balance: " + balance);
    }
}