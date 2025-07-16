package exercises.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Arrays;

public class Words {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static long howManyLines(String file, String subString) throws IOException {
        return getLines(file).stream()
                .filter(s -> s.contains(subString))
                .count();
    }

    public static long howManyTimes(String file, String word) throws IOException {
        return getLines(file).stream()
                .flatMap(line -> lineToWords(line).stream()
                        .filter(currentWord -> currentWord.equals(word)))
                .count();
    }
}
