package com.string;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {

	@Before
	public void before(){
		System.out.println("before");
	}
	
	@After
	public void after(){
		System.out.println("after");
	}
	
	@Test
	public void testCompareString() {
		System.out.println("first");
		Demo demo = new Demo();
		assertTrue(demo.compareString("hello", "hello"));
		assertFalse(demo.compareString("helo", "hello"));
		assertTrue("helo and hello fails", demo.compareString("hello", "hello"));
	}
	
	@Test
	public void testConcatString(){
		System.out.println("second");
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
	
	@Test(expected=ArithmeticException.class)
	public void testException(){
		Demo demo = new Demo();
		demo.exception(0);
	}

}
