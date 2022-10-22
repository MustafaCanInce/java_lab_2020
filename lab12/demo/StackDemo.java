package demo;

import stack.Stack;
import stack.StackArrayImpl;
import stack.StackImpl;

public class StackDemo {

    public static void main(String[] args){
        Stack stack = new StackArrayImpl();
        stack.push("A");
        stack.push(5);
        stack.push("Z");
        stack.push("B");
        stack.push("Hello");
        while(!stack.empty())
            System.out.println(stack.pop());
    }
}