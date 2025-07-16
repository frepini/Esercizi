package exercises.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {
    final List<Person> people;

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    public PhoneBook(List<Person> people) {
        this.people = people;
    }

    public Optional<Person> searchByLastname(String lastname) {
        return people.stream()
                .filter(p -> p.getLastname().equals(lastname))
                .findFirst();
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        return people.stream()
                .filter(p -> p.getName().equals(name) && p.getLastname().equals(lastname))
                .findFirst();
    }
}
