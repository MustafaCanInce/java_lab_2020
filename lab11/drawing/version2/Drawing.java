package drawing.version2;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class Drawing {

	private ArrayList<Object> shapes = new ArrayList<Object>();

	public double calculateTotalArea(){
		double totalArea = 0;

		for (Object shape : shapes){
			System.out.println(shape.getClass());
			if (shape instanceof Circle){
				Circle c = (Circle) shape;
				totalArea += c.area();
			}else if (shape instanceof Rectangle){
				Rectangle r = (Rectangle) shape;
				totalArea += r.area();
			}else if (shape instanceof Square){
				Square s = (Square) shape;
				totalArea += s.area();
			}
		}

		return totalArea;
	}

	public void addShape(Object shape) {
		shapes.add(shape);

	}