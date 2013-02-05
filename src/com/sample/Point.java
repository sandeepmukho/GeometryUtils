package com.sample;

/**
 * @author sandy
 * TODO
 */
public class Point {
	protected double x;
	protected double y;
	
	public Point(double x , double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistance(Point other) {
		double dx = other.x - this.x; // horizontal difference
		double dy = other.y - this.y; // vertical difference
		// distance using Pythagoras theorem		
		double dist = Math.sqrt(dx * dx + dy * dy); //can use Math.pow to square the dx and dy
		return dist;
	}	
	
	@Override
	public String toString() {
		return "x = " +this.x + ", y = " + this.y;
	}

}
