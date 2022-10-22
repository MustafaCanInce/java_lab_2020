package generics;

import java.util.ArrayList;
import java.util.List;

public class StackArrayImpl<T> implements Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(0, item);
    }

    @Override
    public T pop() {
        return stack.remove(0);
    }

    @Override
    public boolean empty() {
        return stack.size() == 0;
    }

    @Override
    public List<T> toList() {
        return stack;
    }
}
