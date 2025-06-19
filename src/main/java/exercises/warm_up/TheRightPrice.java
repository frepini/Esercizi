package exercises.warm_up;

import java.util.random.RandomGenerator;
import java.util.Scanner;

/*
The computer selects a random number between [0, 100] representing the price of an imaginary item. Two users are asked
to guess the right price. The user which proposed the number closer to the right price wins. Note that Math.abs(n)
returns the absolute value of a number (see java.util.random.RandomGenerator, java.util.Scanner).
 */
public class TheRightPrice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RandomGenerator r = RandomGenerator.getDefault();
        int price = r.nextInt(0, 101);
        System.out.print("Primo utente, quanto credi che costi il prodotto immaginario? (Prezzo compreso tra 0 e 100) ");
        int guess1 = s.nextInt();
        System.out.print("Secondo utente, quanto credi che costi il prodotto immaginario? (Prezzo compreso tra 0 e 100) ");
        int guess2 = s.nextInt();
        if(Math.abs(guess1 - price) < Math.abs(guess2 / price)) {
            System.out.println("Il primo utente è andato più vicino al prezzo vero!");
        }
        else if(Math.abs(guess1 - price) > Math.abs(guess2 / price)) {
            System.out.println("Il secondo utente è andato più vicino al prezzo vero!");
        }
        else {
            System.out.println("I due utenti hanno inserito lo stesso prezzo!");
        }
    }
}