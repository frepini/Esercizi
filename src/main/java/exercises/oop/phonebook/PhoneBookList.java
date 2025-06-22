package exercises.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    final ArrayList<Person> phonebook;

    public PhoneBookList() {
        phonebook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
        if (phonebook.contains(p) || phonebook.size() >= MAX_PERSONS) {
            return false;
        }

        return phonebook.add(p);
    }

    @Override
    public boolean removePerson(Person p) {
        if (phonebook.contains(p)) {
            return phonebook.remove(p);
        }

        return false;
    }

    @Override
    public Person[] searchByLastName(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phonebook) {
            if (p != null && p.getLastname().equals(lastname)) {
                tmp.add(p);
            }
        }

        return tmp.toArray(new Person[] {});
    }

    @Override
    public Person[] searchByNameAndLastName(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phonebook) {
            if (p != null && p.getName().equals(name) && p.getLastname().equals(lastname)) {
                tmp.add(p);
            }
        }

        return tmp.toArray(new Person[] {});
    }
}