package examples.functional.functions;

import java.util.function.Supplier;
import java.util.random.RandomGenerator;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplierBasic = () -> "Hello World!";

        Supplier<String> supplierRandom = () -> {
            RandomGenerator rnd = RandomGenerator.getDefault();
            return "Hello World!-" + Integer.valueOf(rnd.nextInt(100));
        };

        System.out.println(supplierBasic.get());
        System.out.println(supplierRandom.get());
    }
}
