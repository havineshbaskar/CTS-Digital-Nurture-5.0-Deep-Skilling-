public class BankAccount {

    private double balance = 1000;

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double checkBalance() {
        return balance;
    }

    public boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }
}