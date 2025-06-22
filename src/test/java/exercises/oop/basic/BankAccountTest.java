package exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount empty;
    BankAccount full;

    @BeforeEach
    void setUp() {
        empty = new BankAccount();
        full = new BankAccount(1000);
    }

    @Test
    void getBalance() {
        assertEquals(0, empty.getBalance());
        assertEquals(1000, full.getBalance());
    }

    @Test
    void deposit() {
        empty.deposit(50);
        assertEquals(50, empty.getBalance());
        full.deposit(250);
        assertEquals(1250, full.getBalance());
    }

    @Test
    void withdraw() {
        empty.deposit(50);
        empty.withdraw(10);
        assertEquals(40, empty.getBalance());
        full.withdraw(400);
        assertEquals(600, full.getBalance());
    }
}