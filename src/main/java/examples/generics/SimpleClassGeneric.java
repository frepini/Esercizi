package examples.generics;

public class SimpleClassGeneric<T> {
    public <U> T getParameterizedObject(T t, U u) {
        return t;
    }
}
