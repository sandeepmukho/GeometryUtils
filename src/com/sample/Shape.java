package com.sample;


/**
 * @author sandy
 * TODO
 */
public interface Shape {
	
	/**
	 * Check whether the point falls inside the Shape
	 * @param p
	 * @return
	 */
	public boolean isPointInsideShape(Point p);
	
	/*
	 * Function to calculate area of shape
	 */
	public double area();

}
