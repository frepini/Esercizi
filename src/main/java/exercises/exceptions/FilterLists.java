package exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> ris = new ArrayList<>();

        for (List<String> l : lists) {
            try {
                for (String s : l) {
                    CheckString.checkString(s);
                }
                ris.add(l);
            } catch (ParseException ignored) {
            }
        }

        return ris;
    }
}
