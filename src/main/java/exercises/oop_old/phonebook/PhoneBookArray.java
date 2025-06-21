package exercises.oop_old.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook{
    private final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSON];
    }

    @Override
    public boolean addPerson(Person p) {
        // controlliamo se la persona c'è già nell'array o meno, in quel caso non l'aggiungiamo
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i] != null && phoneBook[i].equals(p)) {
                return false;
            }
        }

        // controlliamo, ora, se c'è un posto libero nel'array
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i] == null) {
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i] != null && phoneBook[i].equals(p)) {
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] ris = new Person[MAX_PERSON];
        int pos = 0;
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname)) {
                ris[pos] = phoneBook[i];
                pos++;
            }
        }
        return Arrays.copyOf(ris, pos);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] ris = new Person[MAX_PERSON];
        int pos = 0;
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname) && phoneBook[i].getName().equals(name)) {
                ris[pos] = phoneBook[i];
                pos++;
            }
        }
        return Arrays.copyOf(ris, pos);
    }

    @Override
    public String toString() {
        return "PhoneBookArray{" +
                "phoneBook=" + Arrays.toString(phoneBook) +
                '}';
    }

    public static void main(String[] args) {
        PhoneBookArray p = new PhoneBookArray();
        p.addPerson(new Person("fre", "p", "123"));
        p.addPerson(new Person("matte", "c", "456"));
        System.out.println(p);
        p.removePerson(new Person("fre", "p", "123"));
        System.out.println(p);
        p.addPerson(new Person("matte", "c", "789"));
        System.out.println(p);
        System.out.println(Arrays.toString(p.searchByNameAndLastname("matte", "c")));
    }
}