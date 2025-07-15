package examples.functional.functions;

@FunctionalInterface
public interface MyAction {
    void execute();

    public static void main(String[] args) {
        MyAction action = () -> System.out.println("Action executed!");
        action.execute();
    }
}
