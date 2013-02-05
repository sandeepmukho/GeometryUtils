package com.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Point(0, 30);
		p2 = new Point(20, 30);
		p3 = new Point(0, 0);		
		p4 = new Point(20, 0);		
		
	}

	@Test
	public void testArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPointInsideShape() {
		fail("Not yet implemented");
	}

}
