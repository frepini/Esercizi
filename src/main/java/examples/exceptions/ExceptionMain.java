package examples.exceptions;

public class ExceptionMain {
    private static void testCheckedException() throws CheckedException {
        throw new CheckedException("prova checked exception");
    }

    private static void testUncheckedException() {
        throw new UncheckedException("prova unchecked exception");
    }

    public static void main(String[] args) throws CheckedException {
        try {
            testCheckedException();
        }
        catch(CheckedException e) {
            System.out.println("Something bad: " + e.getMessage());
        }

        try {
            testUncheckedException();
        }
        catch (UncheckedException e) {
            System.out.println("Something bad: " + e.getMessage());
        }
    }
}
