package Model;

import Interface.IShape;

public class Square implements IShape {
	@Override
	public void draw() {
		System.out.println("Drawing square..");
	}
}
