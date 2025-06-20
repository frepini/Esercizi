package exercises.strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s) {
        if (s.startsWith("good") || s.startsWith("good", 1)) {
            return true;
        }

        return false;
    }
}