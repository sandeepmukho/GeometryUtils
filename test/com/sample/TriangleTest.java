package com.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	private Point p1;
	private Point p2;
	private Point p3;
	private Point other;
	
	private Triangle t;

	@Before
	public void setUp() {
		p1 = new Point(0, 0);
		p2 = new Point(20, 0);
		p3 = new Point(0, 30);
		other = new Point(0, 1);
		t = new Triangle(p1, p2, p3);
	}
	
	@Test
	public void testIsPointInsideShape() {
		t = new Triangle(p1, p2, p3);
		assertTrue( t.isPointInsideShape(other));
	}

	@Test
	public void testArea() {
		System.out.println(p3);
		t = new Triangle(p1, p2, p3);
		assertEquals(t.area(), 300, 0);
	}	

}
