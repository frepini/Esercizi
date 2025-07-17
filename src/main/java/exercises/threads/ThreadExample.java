package exercises.threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreadExample {
    public static void main(String[] args) throws Exception {
        Process process = new ProcessBuilder("/bin/ls", "-l", "/Users/francesco/").start();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        System.out.println(process.exitValue());
    }
}
