package exercises.exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) {
        LocalDate start = LocalDate.parse(begin);
        LocalDate ending = LocalDate.parse(end);
        return start.isBefore(ending);
    }
}
