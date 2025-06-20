package examples.lezione2025_03_20;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Fre", LocalDate.of(2004, 10, 19), "Via");
        Client c = new Client("Mar", LocalDate.of(2004, 4, 1), "Aiv", "0001", true);
        System.out.println(p);
        System.out.println(c);
    }
}