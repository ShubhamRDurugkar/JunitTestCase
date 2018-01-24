package com.CalculatorApp;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator;

	@BeforeClass
	public static void setUp()
	{
		calculator=new Calculator();
	}
	@AfterClass
	public static void tearDown()
	{
		calculator=null;
	}
	@Test
	public void testAdd()
	{
		assertEquals("Values not matched",30,calculator.add(20,10));
	}
	@Test
	public void testSub()
	{
		assertEquals("Values not matched",10,calculator.sub(20,10));
	}
	@Test
	public void testMul()
	{
		assertEquals("Values not matched",200,calculator.multi(20,10));
	}
	@Test
	public void testDiv()
	{
		assertEquals("Values not matched",2,calculator.div(20,10));
	}
	@Test
	public void testAddFail()
	{
		assertNotEquals("Values not matched",20,calculator.add(20,10));
	}
	@Test
	public void testSubFail()
	{
		assertNotEquals("Values not matched",30,calculator.sub(20,10));
	}
	@Test
	public void testMulFail()
	{
		assertNotEquals("Values not matched",20,calculator.multi(20,10));
	}
	@Test
	public void testDivFail()
	{
		assertNotEquals("Values not matched",5,calculator.div(20,10));
	}	
}
