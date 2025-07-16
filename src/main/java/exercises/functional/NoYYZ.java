package exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {
    public static List<String> noYYZ(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .peek(s -> {
                    if(s.startsWith("z")) {
                        System.out.println(s);
                    }
                })
                .filter(s -> !(s.contains("yy")))
                .collect(Collectors.toList());
    }
}
