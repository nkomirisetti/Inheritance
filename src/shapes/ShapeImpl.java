package shapes;

import java.awt.Color;

public abstract class ShapeImpl implements Shape {
	
	protected Color lineColor;
	protected Color fillColor;
	protected int position;
	
	public ShapeImpl(Color lineColor, Color fillColor, int position) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.position = position;
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
	public abstract String getNameOfShape();
}
