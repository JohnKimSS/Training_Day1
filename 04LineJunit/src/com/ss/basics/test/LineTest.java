package com.ss.basics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.basics.line.Line;

public class LineTest {
	
	private Line ln = new Line(1.0, 2.0, 3.0, 4.0); // slope = 1, dist = sqrt(8) 
	private Line lnBy0 = new Line(1.0, 4.20, 1.0, 3.60); // Delta-x will be 0
	private Line parLn = new Line(2.0, 3.0, 4.0, 5.0); // Line parallel to ln
	private Line perpLn = new Line(-2.0, 3.0, -4.0, 5.0); // Line perpendicular to both ln and parLn
	
	@Test
	public void getSlope( ) {
	
		assertEquals(1.0, ln.getSlope(), 0.001);
		assertNotEquals(4.20, ln.getSlope(), 0.001);
		assertThrows(ArithmeticException.class, lnBy0.getSlope());
	}
	

	public void getDistance() {
		assertEquals(Math.sqrt(8.0), ln.getDistance(), 0.001);
		assertNotEquals(5.0, ln.getDistance(), 0.001);
		
	}
	
	public void parallelTo() {
		assertTrue(ln.parallelTo(parLn));
		assertFalse(ln.parallelTo(perpLn));
	}
	
	
	
//	@Test
//	public void getDistance() {
//		
//	}
}