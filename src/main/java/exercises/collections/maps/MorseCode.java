package exercises.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    private static Map<Character, String> convert() {
        Map<Character, String> ris = new HashMap<>();
        ris.put('a', "._");
        ris.put('b', "_...");
        ris.put('c', "_._.");
        ris.put('d', "_..");
        ris.put('e', ".");
        ris.put('f', ".._.");
        ris.put('g', "__.");
        ris.put('h', "....");
        ris.put('i', "..");
        ris.put('j', ".___");
        ris.put('k', "_._");
        ris.put('l', "._..");
        ris.put('m', "__");
        ris.put('n', "_.");
        ris.put('o', "___");
        ris.put('p', ".__.");
        ris.put('q', "__._");
        ris.put('r', "._.");
        ris.put('s', "...");
        ris.put('t', "_");
        ris.put('u', ".._");
        ris.put('v', "..._");
        ris.put('w', ".__");
        ris.put('x', "_.._");
        ris.put('y', "_.__");
        ris.put('z', "__..");

        ris.put('1', ".____");
        ris.put('2', "..___");
        ris.put('3', "...__");
        ris.put('4', "...._");
        ris.put('5', ".....");
        ris.put('6', "_....");
        ris.put('7', "__...");
        ris.put('8', "___..");
        ris.put('9', "____.");
        ris.put('0', "_____");

        return ris;
    }

    public static String morseCode(String string) {
        if (string.length() == 0) {
            return "";
        }

        if (!string.toLowerCase().matches("[a-z0-9]+")) {
            throw new IllegalArgumentException("È possibile passare solamente le 26 lettere dell'alfabeto inglese e i numeri da 0 a 9");
        }

        StringBuilder sb = new StringBuilder();
        Map<Character, String> converter = convert();

        for (Character c : string.toLowerCase().toCharArray()) {
            sb.append(converter.get(c)).append(" ");
        }

        // usiamo la funzione .trim() per togliere l'ultimo spazio
        return sb.toString().trim();
    }
}
