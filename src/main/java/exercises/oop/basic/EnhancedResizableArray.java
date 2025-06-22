package exercises.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {
    public static final int DEFAULT_CAPACITY = 4;
    private int[] v;

    /**
     * Costruttore che crea e inizializza a 0 tutti gli elementi dell'array v
     */
    public EnhancedResizableArray() {
        v = new int[DEFAULT_CAPACITY];
    }

    /**
     * Restituisce l'elemento alla posizione index dell'array v
     * @param index indice dell'elemento che si vuole leggere
     * @return elemento alla posizione index
     */
    public int get(int index) {
        return v[index];
    }

    /**
     * Inserisce il valore value alla posizione index
     * Se la posizione passata è maggiore della dimensione dell'array v, viene creato un nuovo array di dimensione
     * pari a 2 * index e che contiene tutti gli elementi di v e quelli nuovi sono nulli.
     * @param index indice al quale si vuole inserire l'elemento value
     * @param value elemento che si vuole inserire
     */
    public void set(int index, int value) {
        if (index >= v.length) {
            int[] tmp = new int[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    /**
     * Restituisce true se l'array v contiene l'elemento con valore value
     * @param value elemento da cercare
     * @return true se l'array v contiene l'elemento value, false altrimenti
     */
    public boolean contains(int value) {
        return (Arrays.binarySearch(v, value)) >= 0;
    }

    /**
     * Riempie l'array v di elementi con valore v
     * @param value valore a cui settare tutti gli elementi dell'array
     */
    public void fill(int value) {
        Arrays.fill(v, value);
    }

    /**
     * Restituisce la capacità dell'array v
     * @return capacità dell'array v
     */
    public int length() {
        return v.length;
    }

    /**
     * Restituisce una copia dell'array v
     * @return copia dell'array v
     */
    public int[] toArray() {
        return Arrays.copyOf(v, v.length);
    }
}