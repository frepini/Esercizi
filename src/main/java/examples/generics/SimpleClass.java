package examples.generics;

public class SimpleClass {
    public <T> T getParameterizedObject(T t) {
        return t;
    }

    public static void main(String[] args) {
        SimpleClass i = new SimpleClass();
        Integer intero = i.getParameterizedObject(601);         // will return 601
        String stringa = i.getParameterizedObject("Hello");     // will return "Hello"
    }
}
