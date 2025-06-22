package exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;

class PhoneBookArrayTest {
    PhoneBookArray pb;

    @BeforeEach
    void setUp() {
        pb = new PhoneBookArray();
        pb.addPerson(new Person("Francesco", "Pini", "01234"));
        pb.addPerson(new Person("Mario", "Rossi", "98765"));
        pb.addPerson(new Person("Francesco", "Pini", "01234"));
        pb.removePerson(new Person("Francesco", "Pini", "01234"));
        pb.removePerson(new Person("Leopoldo", "Pirelli", "38294"));
    }
}