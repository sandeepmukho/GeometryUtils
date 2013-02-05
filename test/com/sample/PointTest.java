package com.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	
	private Point p1;
	private Point p2;

	@Before
	public void setUp() throws Exception {
		p1 = new Point(0, 0);
		p2 = new Point(3, 4);		
	}

	@Test
	public void testGetDistance() {		
		assertEquals( p1.getDistance(p2), 5, 0 );
		p2 = new Point(2, 10);
		assertEquals( p1.getDistance(p2), 10.19, 0.1 );
		p2 = new Point(2, 9);
		assertEquals( p1.getDistance(p2), 9.21, 0.1 );
	}

}
