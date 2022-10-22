package generics;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class StackDemo {

    public static void main(String[] args){

        Stack<Shape> shapeStack = new StackImpl<>();

        shapeStack.push(new Circle(4));
        shapeStack.push(new Rectangle(5,6));
        shapeStack.push(new Circle(2));
        shapeStack.push(new Rectangle(6,7));

        System.out.println(shapeStack.toList());

        Stack<Circle> circleStack = new StackImpl<>();

        circleStack.push(new Circle(10));
        circleStack.push(new Circle(7));

        System.out.println(circleStack.toList());

        shapeStack.addAll(circleStack);

        System.out.println(shapeStack.toList());
        /*

        Stack<Integer> stack = new StackImpl<>();
        stack.push(1);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(4);

        System.out.println(stack.toList());

        Stack<Integer> stackA = new StackImpl<>();
        stackA.push(3);
        stackA.push(2);
        stackA.push(1);

        System.out.println(stackA.toList());

        stack.addAll(stackA);
        System.out.println(stack.toList());

        int total = 0;
        while(!stack.empty())
            total += stack.pop();

        System.out.println("total = " + total);
        System.out.println(stack.toList());

        */
    }
}
