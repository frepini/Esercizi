package exercises.oop.library;

import java.util.Objects;

public class Book extends Item {
    private int pages;

    /**
     * Costruttore che crea e inizializza un libro
     * @param title titolo del libro
     * @param year anno di pubblicazione del libro
     * @param pages numero di pagine del libro
     */
    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        return Objects.equals(title, book.title) && Objects.equals(year, book.year) && Objects.equals(pages, book.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}