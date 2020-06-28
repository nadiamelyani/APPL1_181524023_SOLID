package Model;

import Interface.IShape;

public class Circle implements IShape {
	@Override
	public void draw() {
		System.out.println("Drawing circle..");
	}
}
