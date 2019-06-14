package com.epam.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringOperationsTest {
	StringOperations stringOperations;
	
	@Before
	public void init() {
	  stringOperations=new StringOperations();
	}
	@Test
	public void testswapChar() {
		assertEquals("test fails for \"AB\"",stringOperations.swapChar("AB"),"BA");
		assertEquals("test fails for \"RAIN\"",stringOperations.swapChar("RAIN"),"RANI");
		assertEquals("test fails for \"A\"",stringOperations.swapChar("A"),"A");
		assertEquals("test fails for \"\"",stringOperations.swapChar(""),"");
	}
	@Test
	public void testRemoveA() {
		assertEquals("test fails for ABCD",stringOperations.removeA("ABCD"),"BCD");
		assertEquals("test fails for AACD",stringOperations.removeA("AACD"),"CD");
		assertEquals("test fails for BACD",stringOperations.removeA("BACD"),"BCD");
		assertEquals("test fails for BBAA",stringOperations.removeA("BBAA"),"BBAA");
		assertEquals("test fails for AABAA",stringOperations.removeA("AABAA"),"BAA");
	}

}
