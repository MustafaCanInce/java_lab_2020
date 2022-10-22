package generics;

import java.util.Collections;
import java.util.List;

public interface Stack<T> {

    void push(T item);
    T pop();
    boolean empty();

    List<T> toList();

    default void addAll(Stack<? extends T> aStack){
        List<? extends T> values = aStack.toList();
        Collections.reverse(values);
        for(T value : values){
            push(value);
        }
    }
}
