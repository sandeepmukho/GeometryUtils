package com.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {

	private Point p1;

	@Before
	public void setUp() throws Exception {
		p1 = new Point(0, 0);

	}

	@Test
	public void testIsPointInsideShape() {
		Circle c = new Circle(p1, 10);
		Point p2 = new Point(2, 10);
		assertFalse(c.isPointInsideShape(p2));
		p2 = new Point(2, 9);
		assertTrue(c.isPointInsideShape(p2));

	}

	@Test
	public void testArea() {
		Circle c = new Circle(p1, 10);
		assertEquals(c.area(), 314, 1);
	}

}
