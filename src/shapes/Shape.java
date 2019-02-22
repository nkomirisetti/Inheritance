package shapes;

import java.awt.Color;

public interface Shape {
	Color getFillColor();
	Color getLineColor();
	int getPosition();
	int getArea();
	String getNameOfShape();
}
