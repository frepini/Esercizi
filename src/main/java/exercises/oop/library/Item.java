package exercises.oop.library;

public abstract class Item {
    protected String title;
    protected int year;

    /**
     * Costruttore che crea e inizializza un oggetto (libro o dvd)
     * @param title titolo dell'oggetto (libro o dvd)
     * @param year anno di pubblicazione dell'oggetto (libro o dvd)
     */
    protected Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}