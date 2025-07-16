package utils;

import java.util.Objects;

public class Account {
    private long balance;
    private String number;

    public Account(long balance, String number) {
        this.balance = balance;
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, number);
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                '}';
    }
}
