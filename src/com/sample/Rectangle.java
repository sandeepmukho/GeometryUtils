package com.sample;

/**
 * @author sandy TODO
 */
public class Rectangle implements Shape {

	protected Point topLeft;
	protected Point bottomLeft;
	protected Point topRight;
	protected Point bottomRight;

	public Rectangle(Point topLeft, Point topRight, Point bottomLeft,
			Point bottomRight) {
		this.topLeft = topLeft;
		this.topRight = topRight;
		this.bottomLeft = bottomLeft;		
		this.bottomRight = bottomRight;
	}

	/**
	 * Assumption for Rectangle : Rectangle sides parallel to X or y axis
	 * 
	 * @param topLeft
	 * @param bottomRight
	 */
	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomLeft = new Point(topLeft.getX(), bottomRight.getY());
		this.topRight = new Point(bottomRight.getX(), topLeft.getY());
		this.bottomRight = bottomRight;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public Point getBottomLeft() {
		return bottomLeft;
	}

	public void setBottomLeft(Point bottomLeft) {
		this.bottomLeft = bottomLeft;
	}

	public Point getTopRight() {
		return topRight;
	}

	public void setTopRight(Point topRight) {
		this.topRight = topRight;
	}

	public Point getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sample.Shape#area()
	 */
	public double area() {
		double side1 = topLeft.getDistance(topRight);
		double side2 = topLeft.getDistance(bottomLeft);
		return side1 * side2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sample.Shape#isPointInsideShape(com.sample.Point)
	 */
	public boolean isPointInsideShape(Point p) {
		Triangle t1 = new Triangle(topLeft, bottomLeft, bottomRight);
		Triangle t2 = new Triangle(topLeft, topRight, bottomRight);
		return t1.isPointInsideShape(p) || t2.isPointInsideShape(p);
	}

}
