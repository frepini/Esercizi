package exercises.oop.phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookList implements PhoneBook{
    private final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
        if(!phoneBook.contains(p) && phoneBook.size() < MAX_PERSON) {
            phoneBook.add(p);
            return true;
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        if(phoneBook.contains(p)) {
            phoneBook.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] ris = new Person[MAX_PERSON];
        int pos = 0;
        for(Person current : phoneBook) {
            if(current.getLastname().equals(lastname)) {
                ris[pos] = current;
            }
        }
        return Arrays.copyOf(ris, pos);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] ris = new Person[MAX_PERSON];
        int pos = 0;
        for(Person current : phoneBook) {
            if(current.getLastname().equals(lastname) && current.getName().equals(name)) {
                ris[pos] = current;
            }
        }
        return Arrays.copyOf(ris, pos);
    }
}