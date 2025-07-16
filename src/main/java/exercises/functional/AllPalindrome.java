package exercises.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
        return strings.stream()
                .allMatch(s -> new StringBuilder(s).reverse().toString().equals(s));
    }
}
