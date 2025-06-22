package exercises.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0, 0.0);
    }

    @Override
    public double withdraw(double amount) {
        double allowedAmount = Math.min(amount, balance);
        return super.withdraw(allowedAmount);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        // bisogna controllare che il paese sia lo stesso perché il conto bancario easy può fare trasferimenti solo nello stesso paese
        String countrySRC = IBAN.substring(0, 2);
        String countryDST = other.getIBAN().substring(0, 2);
        if (!(countrySRC.equals(countryDST))) {
            throw new IllegalArgumentException("Non è possibile effettuare trasferimenti internazionali");
        }

        double allowedAmount = withdraw(amount);
        other.deposit(allowedAmount);
        return allowedAmount;
    }

    @Override
    public String toString() {
        return "BankAccountEasy{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", operationFee=" + operationFee +
                ", interestRate=" + interestRate +
                '}';
    }
}