package examples;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Marco", 22, 70);
        Patient patient2 = new Patient("Marco", 22, 70);
        System.out.println(patient.toString());
        System.out.println(patient.equals(patient2));
    }
}