package generics;

public class StackItem<T> {
    private T item;
    private StackItem next;

    public StackItem(T item){
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }

    public T getItem(){
        return item;
    }
}
