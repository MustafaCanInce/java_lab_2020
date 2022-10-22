package shapes3d;

public class TestShapes3d {

    public static void main(String[] args){
        Cylinder cy = new Cylinder(5,10);
        System.out.println(cy.toString());
        System.out.println("Cylinder Volume = " + cy.volume());
        System.out.println("Cylinder Area = " + cy.area());

        Cube cube = new Cube(4);

        System.out.println(cube);

        System.out.println("Cube Volume = " + cube.volume());
        System.out.println("Cube Area = " + cube.area());
    }

}
