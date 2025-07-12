package exercises.collections.maps;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordFrequency {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> m = new HashMap<>();
        List<String> lines = getLines(filename);

        for (String line : lines) {
            for (String word : lineToWords(line)) {
                if (m.containsKey(word)) {
                    m.put(word, m.get(word) + 1);
                } else {
                    m.put(word, 1);
                }
            }
        }

        return m;
    }
}
