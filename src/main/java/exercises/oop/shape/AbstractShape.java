package exercises.oop.shape;

public abstract class AbstractShape implements Computable, Movable, Resizable {
    protected String id;
    protected String color;

    /**
     * Costruttore che crea e inizializza l'oggetto
     * @param id id dell'oggetto da creare
     * @param color colore dell'oggetto da creare
     */
    protected AbstractShape(String id, String color) {
        this.id = id;
        setColor(color);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.matches("^#[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Il colore inserito non è valido");
        }
    }
}