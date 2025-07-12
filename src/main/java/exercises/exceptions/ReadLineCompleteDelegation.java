package exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        /*
        complete delegation model means that the method that runs into an exception doesn't have to handle it.
        Instead, it should send it to the caller, and it's him that has to handle it. This is reached by writing
        "throws IOException" after the method prototype and without using the catch block but only the try one.
        */
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.readLine();
        }
    }
}
