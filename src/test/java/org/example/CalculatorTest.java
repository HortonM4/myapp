package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

	private Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void testAddPositiveNumbers() {
		// Arrange
		int a = 10;
		int b = 20;

		// Act
		int result = calc.add(a,b);

		// Assert
		assertEquals(30, result);

	}

	@Test
	public void testAddZeroToPositive() {
		// Arrange
		int a = 10;
		int b = 0;

		// Act
		int result = calc.add(a,b);

		// Assert
		assertEquals(10, result);

	}

}