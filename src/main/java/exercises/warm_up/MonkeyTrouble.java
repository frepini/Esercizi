package exercises.warm_up;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean aSmile, bSmile;
        System.out.println("La scimmia (a) sta sorridendo? (true/false)");
        aSmile = s.nextBoolean();
        System.out.println("La scimmia (b) sta sorridendo? (true/false)");
        bSmile = s.nextBoolean();
        if((aSmile && bSmile) || (!aSmile && !bSmile)) {
            System.err.println("Siamo nei guai");
        }
        else {
            System.out.println("Non siamo nei guai");
        }
    }
}
