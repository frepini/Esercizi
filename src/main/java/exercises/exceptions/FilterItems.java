package exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> ris = new ArrayList<>();

        for (String s : strings) {
            try {
                CheckString.checkString(s);
                ris.add(s);
            } catch (ParseException ignored) {
            }
        }

        return ris;
    }
}
