package exercises.collections.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class SortAccountTest {
    List<SortAccount.Account> accounts = new ArrayList<>(List.of(
            new SortAccount.Account(1000, 0.03, LocalDate.of(2025, 6, 30)),
            new SortAccount.Account(2000, 0.02, LocalDate.of(2025, 5, 30)),
            new SortAccount.Account(3000, 0.01, LocalDate.of(2025, 7, 30))
    ));

    @Test
    void sortByAmount() {
        SortAccount.sortByAmount(accounts);
        assertEquals(1000, accounts.getFirst().getAmount());
    }

    @Test
    void sortByInterestRate() {
        SortAccount.sortByInterestRate(accounts);
        assertEquals(3000, accounts.getFirst().getAmount());
    }

    @Test
    void sortByDuePayment() {
        SortAccount.sortByDuePayment(accounts);
        assertEquals(2000, accounts.getFirst().getAmount());
    }
}