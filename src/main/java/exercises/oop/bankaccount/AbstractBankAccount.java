package exercises.oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {
    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    protected AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        setIBAN(IBAN);
        setOperationFee(operationFee);
    }

    /**
     * Controlla che il valore passato sia positivo
     * @param value valore da controllare
     */
    protected void checkPositiveValue(double value) {
        if (value < 0.0) {
            throw new IllegalArgumentException("Per questa operazione non sono concessi valori negativi");
        }
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        checkPositiveValue(operationFee);
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        checkPositiveValue(amount);
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        checkPositiveValue(amount);
        balance -= amount;
        return amount;
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        checkPositiveValue(amount);
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }

    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void applyFee() {
        balance -= operationFee;
    }
}