package exercises.oop.library;

import java.util.Objects;

public class Dvd extends Item {
    private int length;

    /**
     * Costruttore che crea e inizializza un dvd
     * @param title titolo del dvd
     * @param year anno di pubblicazione del dvd
     * @param length lunghezza del dvd (in minuti)
     */
    public Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dvd dvd = (Dvd) o;

        return Objects.equals(title, dvd.title) && Objects.equals(year, dvd.year) && Objects.equals(length, dvd.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, length);
    }

    @Override
    public String toString() {
        return "Book{" +
                "length=" + length +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}