package exercises.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.02);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyFee();
    }

    @Override
    public double withdraw(double amount) {
        double ris = super.withdraw(amount);
        applyFee();
        return ris;
    }

    @Override
    public String toString() {
        return "BankAccountPro{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", operationFee=" + operationFee +
                ", interestRate=" + interestRate +
                '}';
    }
}