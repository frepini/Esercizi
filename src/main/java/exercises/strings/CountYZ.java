package exercises.strings;

import java.util.StringTokenizer;

public class CountYZ {
    public static int countYZ(String string) {
        int count = 0;
        StringTokenizer s = new StringTokenizer(string);

        while (s.hasMoreTokens()) {
            String curr = s.nextToken().toLowerCase();
            if (curr.endsWith("y") || curr.endsWith("z")) {
                count++;
            }
        }

        return count;
    }
}