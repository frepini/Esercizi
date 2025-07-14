package exercises.generics;

import java.util.Objects;

public class CountOccurrences {
    public static <T> int countOccurencesPlain(T[] src, T item) {
        int occ = 0;
        if (item == null) {
            for (T e : src) {
                if (e == null) {
                    occ++;
                }
            }
        }
        else {
            for (T e : src) {
                if (item.equals(e)) {
                    occ++;
                }
            }
        }
        return occ;
        // alternative version
        /*
        int occ = 0;
        for (T e : src) {
            if (e == item) {
                occ++;
            }
        }
        return occ++;
        */
    }

    public static <T> int countOccurencesObjects(T[] src, T item) {
        int occ = 0;
        for (T e : src) {
            if (Objects.equals(e, item)) {
                occ++;
            }
        }
        return occ;
    }
}
