package com.bluehorn.springmvc.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

	final private BigDecimal no1 = new BigDecimal(50);
	final private BigDecimal no2 = new BigDecimal(5);
	private BigDecimal result = null;
	private Calculator calculator = null; 
	
	
	@Before
	public void beforTest() {
		this.result = null;
		this.calculator = new SimpleCalculator();
	}
	
	@Test
	public void add_positive_test() {
		this.result = calculator.add(no1, no2);
		assertNotNull("Result should not be null!", this.result);
		assertEquals(BigDecimal.valueOf(55), this.result);
	}

	
	@Test
	public void subtract_positive_test() {
		this.result = calculator.subtract(no1, no2);
		assertNotNull("Result should not be null!", this.result);
		assertEquals(BigDecimal.valueOf(45), this.result);
	}
	
	@Test
	public void multiply_positive_test() {
		this.result = calculator.multiply(no1, no2);
		assertNotNull("Result should not be null!", this.result);
		assertEquals(BigDecimal.valueOf(250), this.result);
	}

	
	@Test
	public void divide_positive_test() {
		this.result = calculator.divide(no1, no2);
		assertNotNull("Result should not be null!", this.result);
		//Deliberately failing this ...
		assertEquals(BigDecimal.valueOf(110), this.result);
	}

}
