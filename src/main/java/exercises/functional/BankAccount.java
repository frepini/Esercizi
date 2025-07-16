package exercises.functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BankAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDateTime duePayment) {
            this.duePayment = duePayment;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Account account = (Account) o;
            return Double.compare(amount, account.amount) == 0 && Double.compare(interestRate, account.interestRate) == 0 && Objects.equals(duePayment, account.duePayment);
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount, interestRate, duePayment);
        }

        @Override
        public String toString() {
            return "Account{" +
                    "amount=" + amount +
                    ", interestRate=" + interestRate +
                    ", duePayment=" + duePayment +
                    '}';
        }
    }

    public static List<Account> applyInterest(List<Account> accounts) {
        return accounts.stream()
                .filter(acc -> acc.getDuePayment().isBefore(LocalDateTime.now()))
                .peek(a -> a.setAmount(a.getAmount() + a.getAmount() * a.getInterestRate()))
                // alternative version: .map(a -> new Account(a.getAmount() + a.getAmount() * a.getInterestRate(), a.getInterestRate(), a.getDuePayment()))
                .sorted((o1, o2) -> (int)o2.getAmount() - (int)o1.getAmount())
                .collect(Collectors.toList());
    }
}
