public class Main {
    public static void main(String[] args) {
        // DO NOT MODIFY THIS FILE!
        
        // 1. Testing the Constructor
        BankAccount account = new BankAccount("Alice", 100.0);
        
        System.out.println("Starting Balance: $" + account.getBalance());

        // 2. Testing valid transactions
        account.deposit(50.0);
        account.withdraw(20.0);
        
        // 3. Testing Hacker/Cheat attempts (These should print error messages and NOT change the balance!)
        account.deposit(-500.0);
        account.withdraw(9999.0);

        System.out.println("Final Balance: $" + account.getBalance());
    }
}
