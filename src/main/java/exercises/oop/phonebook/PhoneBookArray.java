package exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    private final Person[] phonebook;

    public PhoneBookArray() {
        phonebook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person p) {
        // controlliamo se la persona p è già presente nella rubrica
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phonebook[i] != null && phonebook[i].equals(p)) {
                return false;
            }
        }

        // inseriamo la persona nel primo posto libero
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phonebook[i] == null) {
                phonebook[i] = p;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        // cerchiamo la persona p nella rubrica
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phonebook[i] != null && phonebook[i].equals(p)) {
                phonebook[i] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public Person[] searchByLastName(String lastname) {
        Person[] ris = new Person[MAX_PERSONS];
        int conta = 0;

        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phonebook[i] != null && phonebook[i].getLastname().equals(lastname)) {
                ris[conta] = phonebook[i];
                conta++;
            }
        }

        return Arrays.copyOf(ris, conta);
    }

    @Override
    public Person[] searchByNameAndLastName(String name, String lastname) {
        Person[] ris = new Person[MAX_PERSONS];
        int conta = 0;

        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phonebook[i] != null && phonebook[i].getName().equals(name) && phonebook[i].getLastname().equals(lastname)) {
                ris[conta] = phonebook[i];
                conta++;
            }
        }

        return Arrays.copyOf(ris, conta);
    }
}