package shapes2d;

public class Square extends Object{
    protected double side;

    public Square(double side) {
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    @Override
    public String toString() {
        return "side=" + side ;
    }
}