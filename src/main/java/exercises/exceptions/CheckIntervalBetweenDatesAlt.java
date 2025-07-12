package exercises.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            LocalDate start = LocalDate.parse(begin);
            LocalDate ending = LocalDate.parse(end);
            return start.isBefore(ending);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
