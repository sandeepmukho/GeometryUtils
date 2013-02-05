package com.sample;



/**
 * @author sandy
 * TODO
 */
public class Triangle implements Shape {

	protected Point a;
	protected Point b;
	protected Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/* (non-Javadoc)
	 * @see com.sample.Shape#isPointInsideShape(com.sample.Point)
	 */
	public boolean isPointInsideShape(Point p) {

		// Calculate area of triangle a, b , c
		double A = this.area();

		// Calculate area of triangle with point p, a, b 
		Triangle t1 = new Triangle(p, a, b);
		double A1 = t1.area();

		// Calculate area of triangle with point a, p, c
		Triangle t2 = new Triangle(a, p, c);
		double A2 = t2.area();

		// Calculate area of triangle with point a, b, p
		Triangle t3 = new Triangle(a, b, p);
		double A3 = t3.area();

		/* Check if sum of A1, A2 and A3 is same as A */
		return (A == A1 + A2 + A3);
	}

	/* (non-Javadoc)
	 * @see com.sample.Shape#area()
	 */
	public double area() {
		double area = Math
				.abs((a.getX() * (b.getY() - c.getY()) + b.getX()
						* (c.getY() - a.getY()) + c.getX()
						* (a.getY() - b.getY())) / 2.0);
		return area;
	}

}
