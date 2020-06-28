package Main;

import Model.Circle;
import Model.GraphicEditor;
import Model.Rectangle;
import Model.Square;

public class Program {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();

		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(circle);
		graphicEditor.drawShape(rectangle);
		graphicEditor.drawShape(square);
	}
}
