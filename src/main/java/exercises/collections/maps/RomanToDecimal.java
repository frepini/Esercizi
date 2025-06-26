package exercises.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    private static Map<Character, Integer> createConverter() {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        return m;
    }

    public static int romanToDecimal(String s) {
        Map<Character, Integer> converter = createConverter();
        int decimal = 0;

        for (int i = 0; i < s.length(); i++) {
            /*
            Nel caso in cui ci troviamo a un elemento che non è l'ultimo e il valore decimale della
            lettera successiva è maggiore significa che dobbiamo sottrarre il valore decimale della lettera attuale
             */
            if ((i < s.length() - 1) && converter.get(s.charAt(i)) < converter.get(s.charAt(i + 1))) {
                decimal -= converter.get(s.charAt(i));
            }
            else {
                decimal += converter.get(s.charAt(i));
            }
        }

        return decimal;
    }
}
