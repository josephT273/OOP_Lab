/*
 * Write a Java program that demonstrates the use of encapsulation by creating a BankAccount class with a private balance variable and public methods to deposit and withdraw money.
 * Expected Task: Create a class with private instance variables and public methods to modify them.
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1200);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(3000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(2500);
        System.out.println(bankAccount.getBalance());
    }
}
