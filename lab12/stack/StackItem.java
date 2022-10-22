package stack;

public class StackItem {
    Object item;
    StackItem next;

    public StackItem(Object item){
        this.item = item;
    }
    public StackItem getNext() {
        return next;
    }
    public void setNext(StackItem next) {
        this.next = next;
    }
    public Object getItem(){
        return item;
    }
}