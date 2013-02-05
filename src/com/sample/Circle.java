package com.sample;

/**
 * @author sandy
 * TODO
 */
public class Circle implements Shape{
	
	protected Point centre;
	protected double radius;
	
	public Circle(Point centre, double radius)
	{
		this.centre = centre;
		this.radius = radius;
	}
	
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isPointInsideShape(Point p) {
		return centre.getDistance(p) <= radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}
