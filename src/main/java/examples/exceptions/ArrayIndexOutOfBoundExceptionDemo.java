package examples.exceptions;

public class ArrayIndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int n1 = array[2];	// n1 is 3
        int n2 = array[3];	// Exception
        int n3 = array[-1];	// Exception
    }
}
