package exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        /*
        no delegation model means that the method that runs into an exception have to completely handle it.
        In case of errors (IOException), the method just returns null
        */
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
