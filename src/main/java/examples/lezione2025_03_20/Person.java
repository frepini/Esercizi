package examples.lezione2025_03_20;

import java.time.LocalDate;

public class Person {
    protected String name;
    protected LocalDate birthday;
    protected String address;

    public Person(String name, LocalDate birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}