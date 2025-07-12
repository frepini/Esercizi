package exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) {
        /*
        partial delegation model means that the method that runs into an exception have to handle it but only partially.
        In case of errors (IOException), the method just throws an unchecked exception (RunTimeException) instead of IOException
        */
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.readLine();
        } catch (IOException e) {
            /*
            The text tells to throw an unchecked exception, so I chose to use an UncheckedIOException
            */
            throw new UncheckedIOException(e);
        }
    }
}
