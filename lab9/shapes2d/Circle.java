package shapes2d;

public class Circle extends Object{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return
                "radius=" + radius;
    }
}
