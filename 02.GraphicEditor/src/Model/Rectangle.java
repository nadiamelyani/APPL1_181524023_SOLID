package Model;

import Interface.IShape;

public class Rectangle implements IShape {
	@Override
	public void draw() {
		System.out.println("Drawing rectangle..");
	}
}
