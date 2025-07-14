package exercises.generics;

public class BinarySearch {
    /**
     * @param array is an array where the element should be found
     * @param key is the element to search
     * @param <T> any comparable type
     *
     * @return the index of the element if present, -1 otherwise
     */
    public static <T extends Comparable<T>> int find(T[] array, T key) {
        return search(array, key, 0, array.length - 1);
    }

    /**
     * This method implements the generic binary search recursively
     *
     * @param array the array to which apply the binary search
     * @param key the element to search
     * @param left the lower bound index
     * @param right the upper bound index
     * @param <T> any comparable type
     *
     * @return the index of the element if present, -1 otherwise
     */
    private static <T extends Comparable<T>> int search(T[] array, T key, int left, int right) {
        if (right < left) {
            return -1;
        }
        int mid = (right + left) >>> 1;
        /*
        the line above is equal to "int mid = (right + left) / 2;" but the problem of this one is that
        this could overflow for larger sums, and you could get a negative number for mid
         */
        int comparator = key.compareTo(array[mid]);

        if (comparator == 0) {
            return mid;
        }
        else if (comparator > 0) {
            return search(array, key, mid + 1, right);
        }
        else {
            return search(array, key, left, mid - 1);
        }
    }

    // my version
    /*
    public static <T extends Comparable<T>> int find(T[] array, T key) {
        int start = 0;
        int end = array.length - 1;
        int mid = end / 2;
        while (start != mid && end != mid) {
            if (Objects.equals(array[start + mid], key)) {
                return mid;
            }
            if (key.compareTo(array[start + mid]) > 0) {
                start = mid;
            }
            else {
                end = mid;
            }
            mid = end / 2;
        }
        return -1;
    }
    */
}
