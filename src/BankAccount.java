public class BankAccount {
    // TODO: Create two PRIVATE attributes:
    // 1. String accountHolder
    // 2. double balance
    private String accountHolder;
    private double balance;

    // TODO: Create a Constructor that takes a String and a double, 
    // and assigns them to your attributes.
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // TODO: Create a 'getBalance' method that returns the current balance.
    public double getBalance() {
        return balance;
    }

    // TODO: Create a 'deposit' method (takes a double amount).
    // If the amount is greater than 0, add it to the balance.
    // Otherwise, print "Error: Invalid deposit amount"
    public void deposit(double amount) {
        if (amount>0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // TODO: Create a 'withdraw' method (takes a double amount).
    // If the amount is greater than 0 AND less than or equal to the balance, subtract it.
    // Otherwise, print "Error: Insufficient funds or invalid amount"
    public void withdraw(double amount) {
        if (amount>0 && amount<= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

}