package generics;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {

    StackItem<T> top = null;

    @Override
    public void push(T item) {
        StackItem<T> box = new StackItem<>(item);
        StackItem<T> previousTop = top;
        top = box;
        top.setNext(previousTop);
    }

    @Override
    public T pop() {
        StackItem<T> oldTop = top;
        top = top.getNext();
        return oldTop.getItem();
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public List<T> toList() {
        ArrayList<T> list = new ArrayList<>() ;
        StackItem<T> item = top;
        while (item != null){
            list.add(item.getItem());
            item = item.getNext();
        }

        return list;
    }
}
