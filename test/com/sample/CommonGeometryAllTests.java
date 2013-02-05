package com.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PointTest.class, CircleTest.class, TriangleTest.class , RectangleTest.class})
public class CommonGeometryAllTests {

}
