package exercises.oop.phonebook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("PhoneBookArray\n-----------------------------------");
        PhoneBookArray pba = new PhoneBookArray();
        System.out.println(pba.addPerson(new Person("Francesco", "Pini", "01234")));
        System.out.println(pba.addPerson(new Person("Mario", "Rossi", "98765")));
        System.out.println(pba.addPerson(new Person("Francesco", "Pini", "01234")));
        System.out.println(pba.removePerson(new Person("Francesco", "Pini", "01234")));
        System.out.println(pba.removePerson(new Person("Leopoldo", "Pirelli", "38294")));
        System.out.println(pba.addPerson(new Person("Leopoldo", "Pirelli", "38294")));
        System.out.println(pba.addPerson(new Person("Alessandro", "Pirelli", "49283")));
        System.out.println(pba.addPerson(new Person("Leopoldo", "Pirelli", "00000")));
        System.out.println("Persone nella rubrica che hanno il cognome Pirelli: " + Arrays.toString(pba.searchByLastName("Pirelli")));
        System.out.println("Persone nella rubrica che hanno il cognome Rossi: " + Arrays.toString(pba.searchByLastName("Rossi")));
        System.out.println("Persone nella rubrica che hanno il cognome Pini: " + Arrays.toString(pba.searchByLastName("Pini")));
        System.out.println("Persone nella rubrica che hanno il nome Leopoldo e il cognome Pirelli: " + Arrays.toString(pba.searchByNameAndLastName("Leopoldo", "Pirelli")));
        System.out.println("Persone nella rubrica che hanno il nome Mario e il cognome Rossi: " + Arrays.toString(pba.searchByNameAndLastName("Mario", "Rossi")));
        System.out.println("Persone nella rubrica che hanno il nome Leopoldo e il cognome Rossi: " + Arrays.toString(pba.searchByNameAndLastName("Leopoldo", "Rossi")));

        System.out.println("\n\nPhoneBookList\n-----------------------------------");
        PhoneBookList pbl = new PhoneBookList();
        System.out.println(pbl.addPerson(new Person("Francesco", "Pini", "01234")));
        System.out.println(pbl.addPerson(new Person("Mario", "Rossi", "98765")));
        System.out.println(pbl.addPerson(new Person("Francesco", "Pini", "01234")));
        System.out.println(pbl.removePerson(new Person("Francesco", "Pini", "01234")));
        System.out.println(pbl.removePerson(new Person("Leopoldo", "Pirelli", "38294")));
        System.out.println(pbl.addPerson(new Person("Leopoldo", "Pirelli", "38294")));
        System.out.println(pbl.addPerson(new Person("Alessandro", "Pirelli", "49283")));
        System.out.println(pbl.addPerson(new Person("Leopoldo", "Pirelli", "00000")));
        System.out.println("Persone nella rubrica che hanno il cognome Pirelli: " + Arrays.toString(pbl.searchByLastName("Pirelli")));
        System.out.println("Persone nella rubrica che hanno il cognome Rossi: " + Arrays.toString(pbl.searchByLastName("Rossi")));
        System.out.println("Persone nella rubrica che hanno il cognome Pini: " + Arrays.toString(pbl.searchByLastName("Pini")));
        System.out.println("Persone nella rubrica che hanno il nome Leopoldo e il cognome Pirelli: " + Arrays.toString(pbl.searchByNameAndLastName("Leopoldo", "Pirelli")));
        System.out.println("Persone nella rubrica che hanno il nome Mario e il cognome Rossi: " + Arrays.toString(pbl.searchByNameAndLastName("Mario", "Rossi")));
        System.out.println("Persone nella rubrica che hanno il nome Leopoldo e il cognome Rossi: " + Arrays.toString(pbl.searchByNameAndLastName("Leopoldo", "Rossi")));
    }
}