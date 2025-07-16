package utils;

import java.util.Objects;

public class AccountStatus {
    private long balance;
    private String number;
    private Status status;

    public AccountStatus(long balance, String number, Status status) {
        this.balance = balance;
        this.number = number;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AccountStatus that = (AccountStatus) o;
        return balance == that.balance && Objects.equals(number, that.number) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, number, status);
    }

    @Override
    public String toString() {
        return "AccountStatus{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                ", status=" + status +
                '}';
    }
}
