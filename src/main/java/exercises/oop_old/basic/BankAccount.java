package exercises.oop_old.basic;

/*
Write a class named BankAccount representing a bank account. Internally, the class uses a double value for representing
the balance of the account. The class provides the following methods:

- public BankAccount() creating an empty account.
- public BankAccount(double balance) creating an account with the specified balance.
- public double getBalance() getting the current balance.
- public void deposit(double amount) depositing the specific amount into the account.
- public void withdraw(double amount) withdrawing the specified amount from the account.
 */

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this(0);
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Metodo per fare un deposito sul conto, quindi aggiungere un determinato valore al balance
     * @param amount quantità da aggiungere al balance
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Metodo per fare un prelievo dal conto, quindi sottrarre un determinato valore al balance
     * @param amount quantità da sottrarre al balance
     */
    public void withdraw(double amount) {
        balance -= amount;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);
        ba.deposit(1000);
        System.out.println(ba);
        ba.deposit(250);
        System.out.println(ba);
        ba.withdraw(1200);
        System.out.println(ba);
        ba.withdraw(75);
        System.out.println(ba);
    }
}