package com.sample;

public class TestMainClass {
	
	public static void main(String[] args) {
		//Point p1 = new Point(0, 0);
		//Point p2 = new Point(0, 1);
		
		Point p1;
		Point p2;
		Point p3;
		
		p1 = new Point(0, 0);
		p2 = new Point(20, 0);
		p3 = new Point(0, 30);
		
		Triangle t = new Triangle(p1, p2, p3);

		System.out.println( t.area());
		
		System.out.println( p1.getDistance(p2));
		
		
		
	}
	
	

}
