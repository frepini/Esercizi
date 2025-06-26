package exercises.collections.sets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordAfterWord {
    public static String wordAfterWord(String filename, String word) throws IOException {
        TreeSet<String> words = new TreeSet<>();
        List<String> lines = getLines(filename);

        // per ogni linea del file
        for (String line : lines) {
            // leggiamo le parole
            List<String> line_words = lineToWords(line);
            // e le aggiungiamo tutte al set contenente le parole
            words.addAll(line_words);
        }

        /*
        Utilizziamo il metodo TreeSet<>.tailSet() che restituisce un subset contenente solo
        gli elementi a partire dall'elemento passato come parametro (se non è presente, il subset
        parte dall'elemento successivo).
        Utilizzando questo metodo otteniamo il subset che parte dalla parola passata come parametro,
        quindi rimuoviamo il primo elemento e restituiamo il primo elemento del subset rimasto che, avendo
        rimosso il primo elemento ovvero la parola passata, sarà la parola successiva a quella passata
         */
        SortedSet<String> ris = words.tailSet(word);
        ris.removeFirst();

        return ris.first();
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
