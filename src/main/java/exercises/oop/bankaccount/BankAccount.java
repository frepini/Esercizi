package exercises.oop.bankaccount;

public interface BankAccount {

    /**
     * Restituisce l'IBAN del conto bancario
     * @return attributo IBAN dell'oggetto
     */
    String getIBAN();

    /**
     * Assegna il valore passato all'attributo IBAN del conto bancario
     * @param IBAN valore da assegnare all'attributo IBAN
     */
    void setIBAN(String IBAN);

    /**
     * Restituisce il saldo del conto bancario
     * @return attributo balance (è il saldo) del conto bancario
     */
    double getBalance();

    /**
     * Assegna il valore passato all'attributo balance del conto bancario
     * @param balance valore da assegnare all'attributo balance
     */
    void setBalance(double balance);

    /**
     * Restituisce il valore della tassa per ciascuna operazione sul conto bancario
     * @return valore dell'attributo operationFee
     */
    double getOperationFee();

    /**
     * Assegna il valore passato all'attributo operationFee del conto bancario
     * @param operationFee valore da assegnare all'attributo operationFee
     */
    void setOperationFee(double operationFee);

    /**
     * Restituisce il valore del tasso di interesse del conto bancario
     * @return valore dell'attributo interestRate
     */
    double getInterestRate();

    /**
     * Assegna il valore passato all'attributo interestRate del conto bancario
     * @param interestRate valore da assegnare all'attributo interestRate
     */
    void setInterestRate(double interestRate);

    /**
     * Effettua un versamento di amount € sul conto
     * @param amount valore del versamento in €
     */
    void deposit(double amount);

    /**
     * Effettua un prelievo dal conto bancario di amount € e restituisce la quantità di € prelevati
     * @param amount valore del prelievo in €
     * @return quantità di € prelevati
     */
    double withdraw(double amount);

    /**
     * Trasferisce amount € dal conto bancario al conto bancario other e restituisce la quantità di € trasferiti
     * @param other conto bancario di destinazione del trasferimento
     * @param amount valore del trasferimento in €
     * @return quantità di € trasferiti
     */
    double transfer(BankAccount other, double amount);

    /**
     * Applica gli interessi al conto bancario
     */
    void addInterest();

    /**
     * Applica la tassa di operazione al conto bancario
     */
    void applyFee();

    /**
     * Controlla se l'IBAN passato è corretto
     * @param IBAN IBAN da controllare
     */
    static void checkIBAN(String IBAN) {
        if (IBAN.length() < 8 || IBAN.length() > 34) {
            throw new IllegalArgumentException("IBAN non valido: lunghezza errata");
        }
        if (!(Character.isLetter(IBAN.charAt(0))) || !(Character.isLetter(IBAN.charAt(1)))) {
            throw new IllegalArgumentException("IBAN non valido: i primi 2 caratteri devono essere lettera maiuscole");
        }
        if (!(Character.isUpperCase(IBAN.charAt(0))) || !(Character.isUpperCase(IBAN.charAt(1)))) {
            throw new IllegalArgumentException("IBAN non valido: i primi 2 caratteri devono essere lettera maiuscole");
        }
    }
}