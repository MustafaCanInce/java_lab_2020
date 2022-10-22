public class TestRectangle {

    public static void main(String[] args){
        Point topLeft = new Point(10, 10);

        Rectangle rect = new Rectangle(5,6,topLeft);

        System.out.println("Rectangle Area = " + rect.area() + " Rectangle Perimeter = " + rect.perimeter());

        Point[] points = rect.corners();
        for (int i=0; i<points.length; i++){
            System.out.println("corner " + i + " at x = " + points[i].xCoord + " at y = " + points[i].yCoord );
        }
    }
}
