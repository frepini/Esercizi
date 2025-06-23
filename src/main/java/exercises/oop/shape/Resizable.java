package exercises.oop.shape;

public interface Resizable {
    /**
     * Ridimensiona l'oggetto
     * @param scale la scala del ridimensionamento, ad esempio 2 significa che sia l'altezza che la larghezza raddoppiano
     */
    void resize(double scale);
}