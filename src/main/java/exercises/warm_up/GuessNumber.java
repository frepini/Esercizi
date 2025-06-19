package exercises.warm_up;

import java.util.random.RandomGenerator;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RandomGenerator r = RandomGenerator.getDefault();
        int random, n;
        do {
            System.out.println("Prova a indovinare il numero (compreso tra 0 e 3):");
            n = s.nextInt();
            random = r.nextInt(0, 4);
        } while(random != n || n != 0);
        System.out.println("Hai indovinato il numero 0!");
    }
}