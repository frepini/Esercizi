package exercises.threads;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class DayChangeCheck extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " started");
        while (!interrupted()) {
            LocalDate lastCheck = LocalDate.now();

            try {
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));           // attende 15 minuti
            } catch (InterruptedException ignored) {
            }

            LocalDate now = LocalDate.now();

            if (now.getDayOfMonth() != lastCheck.getDayOfMonth()) {
                System.out.println(getName() + " the day of the month changed");
            }
        }
        System.out.println(getName() + " terminated");
    }

    public static void main(String[] args) {
        Thread t1 = new DayChangeCheck();
        t1.start();
    }
}
