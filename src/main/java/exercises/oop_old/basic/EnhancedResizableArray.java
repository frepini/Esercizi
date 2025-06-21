package exercises.oop_old.basic;

/*
Write a class named EnhancedResizableArray representing a resizable array. It internally keeps an int array, enlarges it
when needed, and provides its key functionalities via a set of methods:

- public EnhancedResizableArray() creating an empty resizable array (the underlying int[] has a default capacity of DEFAULT_CAPACITY items).
- public int get(int index) returning the element at the specified index.
- public void set(int index, int value) setting the element at the specified index with value. If the underlying int[] capacity
 is smaller than index, a new int[] (with a capacity of index * 2 items) have to be allocated. All the newly allocated elements have to be set to 0.
- public boolean contains(int value) returning true if the specified value is contained within the internal array.
- public void fill(int value) setting all the elements of the internal array to the specified value.
- public int length() returning the capacity of the internal array.
- public int[] toArray() returning a copy of the internal array.
 */

import java.util.Arrays;

public class EnhancedResizableArray {
    static final int DEFAULT_CAPACITY = 10;
    private int[] v;

    public EnhancedResizableArray() {
        v = new int[DEFAULT_CAPACITY];
    }

    /**
     * Metodo che restituisce l'elemento nella posizione index dell'array
     * @param index posizione dell'elemento all'interno dell'array
     * @return elemento alla posizione index dell'array, restituisce -1 se index non è maggiore di 0 e minore di v.length
     */
    public int get(int index) {
        if(index >= 0 && index < v.length) {
            return v[index];
        }
        return -1;
    }

    public void set(int index, int value) {
        if(index >= 0) {
            if(index >= v.length) {
                int[] tmp = new int[index * 2];
                System.arraycopy(v, 0, tmp, 0, v.length);
                v = tmp;
            }
            v[index] = value;
        }
    }

    /**
     * Metodo che cerca il valore specificato all'interno dell'array
     * @param value valore da cercare all'interno dell'array
     * @return true se il valore è presente nell'array, false altrimenti
     */
    public boolean contains(int value) {
        return Arrays.binarySearch(v, value) >= 0;
    }

    /**
     * Metodo che riempie l'array v con il valore value
     * @param value valore con cui verrà riempito l'array
     */
    public void fill(int value) {
        Arrays.fill(v, value);
    }

    /**
     * Metodo che restituisce la capacità dell'array
     * @return capacità dell'array
     */
    public int length() {
        return v.length;
    }

    public int[] toArray() {
        int[] cpy = new int[v.length];
        System.arraycopy(v, 0, cpy, 0, v.length);
        return cpy;
    }

    public static void main(String[] args) {
        EnhancedResizableArray era = new EnhancedResizableArray();
        era.fill(1);
        era.set(15, 5);
        System.out.println(Arrays.toString(era.toArray()));
    }
}