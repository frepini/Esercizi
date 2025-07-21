package examples.exceptions;

import java.util.Scanner;

public class NumberFormataExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
                        // oppure .valueOf(input)
        int number = Integer.parseInt(input);	// an exception is possible here!!!
        System.out.println(number  + 1);
    }
}
