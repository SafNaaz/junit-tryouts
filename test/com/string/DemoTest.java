package com.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void testCompareString() {
		Demo demo = new Demo();
		assertTrue(demo.compareString("hello", "hello"));
		assertFalse(demo.compareString("helo", "hello"));
		assertTrue("helo and hello fails", demo.compareString("hello", "hello"));
	}
	
	@Test
	public void testConcatString(){
		Demo demo = new Demo();
		assertEquals("HelloWorld", demo.concatString("Hello", "World"));
	}
	
	@Test
	public void testAddOneToArray(){
		Demo demo = new Demo();
		int expected[] = new int[]{3,8};
		assertArrayEquals(expected, demo.addOneToArray(new int[]{2,7}));
	}
	
	@Test(timeout=3)
	public void testPerformance(){
		Demo demo = new Demo();
		demo.performamnce();
	}

}
