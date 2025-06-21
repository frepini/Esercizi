package exercises.oop.basic;

public class ClickCounter {
    private int value = 0;

    /**
     * Restituisce il valore dell'attributo value
     * @return il valore dell'attributo value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Incrementa il valore dell'attributo value di 1
     */
    public void click() {
        value++;
    }

    /**
     * Decrementa il valore dell'attributo value di 1, evitando che esso assuma valori negativi
     */
    public void undo() {
        if (value != 0) {
            value--;
        }
    }

    /**
     * Resetta il valore dell'attributo value a 0
     */
    public void reset() {
        value = 0;
    }
}