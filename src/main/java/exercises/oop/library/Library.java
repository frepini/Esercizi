package exercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    final ArrayList<Rent> rents;

    /**
     * Costruttore che crea l'oggetto Library (senza nessun prestito)
     */
    public Library() {
        rents = new ArrayList<>();
    }

    /**
     * Aggiunge il prestito passato (rent) alla lista dei prestiti
     * @param rent prestito da aggiungere alla lista dei prestiti
     * @return true se l'aggiunta è andata a buon fine, false altrimenti
     */
    public boolean addRent(Rent rent) {
        return rents.add(rent);
    }

    /**
     * Rimuove il prestito passato (rent) dalla lista dei prestiti
     * @param rent prestito da rimuovere dalla lista dei prestiti
     * @return true se la rimozione è andata a buon fine, false altrimenti
     */
    public boolean removeRent(Rent rent) {
        return rents.remove(rent);
    }

    /**
     * Restituisce la lista di prestiti scaduti alla data attuale
     * @param now data attuale
     * @return lista di prestiti scaduti alla data attuale
     */
    public ArrayList<Rent> getExpired(LocalDate now) {
        ArrayList<Rent> ris = new ArrayList<>();

        for (Rent r : rents) {
            if (r.isExpired(now)) {
                ris.add(r);
            }
        }

        return ris;
    }

    @Override
    public String toString() {
        return "Library{" +
                "rents=" + rents +
                '}';
    }
}