package shapes2d;

public class TestShapes2d {
    public static void main(String[] args){
        Circle c = new Circle(5);
        Square s = new Square(4);

        System.out.println("Circle area = " + c.area());
        System.out.println(c);
        System.out.println(s);
    }
}
