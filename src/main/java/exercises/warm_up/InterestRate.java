package exercises.warm_up;

/*
Write a program that prints the balance of an account after the first, second, and third year. The account has an
initial balance of $1,000 and earns 5 percent interest per year.
 */
public class InterestRate {
    public static void main(String[] args) {
        double balance = 1000;
        balance += balance * 5 / 100;
        balance += balance * 5 / 100;
        balance += balance * 5 / 100;
        System.out.println(balance);
    }
}