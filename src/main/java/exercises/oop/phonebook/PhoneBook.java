package exercises.oop.phonebook;

/**
 * Interfaccia che rappresenta una generica rubrica e deve fornire metodi per: inserire, rimuovere
 * e cercare persone all'interno della rubrica
 */
public interface PhoneBook {
    public static final int MAX_PERSONS = 256;

    /**
     * Aggiunge la persona p alla rubrica
     * @param p persona da aggiungere alla rubrica
     * @return true se la persona è stata aggiunta correttamente, false altrimenti (ad esempio se era già presente)
     */
    boolean addPerson(Person p);

    /**
     * Rimuove la persona p dalla rubrica
     * @param p persona da rimuovere dalla rubrica
     * @return true se la persona è stata rimossa correttamente, false atrimenti
     */
    boolean removePerson(Person p);

    /**
     * Cerca persone all'interno della rubrica usando il cognome (lastname)
     * @param lastname cognome della/e persona/e da cercare all'interno della rubrica
     * @return array che contiene le persone con il cognome specificato
     */
    Person[] searchByLastName(String lastname);

    /**
     * Cerca persone all'interno della rubrica usando il nome (name) e il cognome (lastname)
     * @param name nome della/e persona/e da cercare all'interno della rubrica
     * @param lastname cognome della/e persona/e da cercare all'interno della rubrica
     * @return array che contiene le persone con il nome e il cognome specificato
     */
    Person[] searchByNameAndLastName(String name, String lastname);
}