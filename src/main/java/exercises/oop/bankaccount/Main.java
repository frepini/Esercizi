package exercises.oop.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccountEasy bae = new BankAccountEasy("IT123456789", 0.0);
        System.out.println(bae);
        bae.deposit(25);
        System.out.println(bae);
        bae.deposit(100);
        System.out.println(bae);
        bae.withdraw(50);
        System.out.println(bae);

        BankAccountPro bap = new BankAccountPro("IT123456789", 0.0);
        System.out.println(bap);
        bap.deposit(25);
        System.out.println(bap);
        bap.withdraw(25);
        System.out.println(bap);

        bae.transfer(bap, 125);
        System.out.println(bae);
        System.out.println(bap);
    }
}