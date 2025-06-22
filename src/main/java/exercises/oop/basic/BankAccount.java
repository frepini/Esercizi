package exercises.oop.basic;

public class BankAccount {
    private double balance;

    /**
     * Costruttore di base che crea un oggetto di tipo BankAccount e inizializza a 0 l'attributo balance
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Costruttore che crea e inizializza un oggetto di tipo BankAccount con il balance specificato
     * @param balance valore a cui inizializzare l'attributo balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Restituisce il valore attuale dell'attributo balance
     * @return valore attuale dell'attributo balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Incrementa il valore del balance di amount (versamento di soldi sull'account)
     * @param amount valore del versamento
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Decrementa il valore del balance di amount (prelievo di soldi dall'account)
     * @param amount valore del prelievo
     */
    public void withdraw(double amount) {
        balance -= amount;
    }
}