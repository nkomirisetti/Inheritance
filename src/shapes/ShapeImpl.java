package shapes;

import java.awt.Color;

public abstract class ShapeImpl implements Shape {
	
	protected int numOfSides;
	protected Color lineColor;
	protected Color fillColor;
	protected int position;
	protected int area;
	protected String nameOfShape;
	
	public ShapeImpl(int numOfSides, Color lineColor, Color fillColor, int position, String nameOfShape, int area) {
		this.numOfSides = numOfSides;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.position = position;
		this.nameOfShape = nameOfShape;
		this.area = area;
	}

	@Override
	public Color getFillColor() {
		return fillColor;
	}

	@Override
	public Color getLineColor() {
		return lineColor;
	}

	@Override
	public int getPosition() {
		return position;
	}

	@Override
	public abstract int getArea();

	@Override
	public String getNameOfShape() {
		return nameOfShape;
	}
}
