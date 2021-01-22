package com.ibm.somename;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void testMain() {
		EvenOdd e=new EvenOdd();
		assertTrue(e.evenM(4));
		assertFalse(e.evenM(4));
		
	}
	@Test
	void testOdd() {
		EvenOdd e=new EvenOdd();
		assertFalse(e.evenM(3));
		
	}
	@Test
	void testEven() {
		EvenOdd e=new EvenOdd();
		assertFalse(e.evenM(4));
		
	}

}
