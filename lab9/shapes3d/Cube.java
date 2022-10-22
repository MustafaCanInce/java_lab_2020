package shapes3d;

import shapes2d.Square;

public class Cube extends Square {

    public Cube(double side){
        super(side);
    }

    public double volume(){
        return super.area() * side;
    }
    @Override
    public double area(){
        return 6 * super.area();
    }
}
