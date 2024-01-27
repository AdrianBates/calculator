package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void testAdd1And1_2() {
		assertEquals(2, calculator.calculate(1, 1, "+"));
	}
	
	@Test
	public void testAdd1And2_3() {
		assertEquals(3, calculator.calculate(1, 2, "+"));
	}
	
	@Test
	public void testAdd0And1_1() {
		assertEquals(1, calculator.calculate(0, 1, "+"));
	}
	
	@Test
	public void testSubtract2And1_1() {
		assertEquals(1, calculator.calculate(2, 1, "-"));
	}
	
	@Test
	public void testSubtract2And0_0() {
		assertEquals(2, calculator.calculate(2, 0, "-"));
	}
	
	@Test
	public void testDivideBy0_IAE() {
		
        Exception exception = assertThrows(
			IllegalArgumentException.class, 
			() -> calculator.calculate(2, 0, "/"));

        assertEquals("Cannot divide by zero", exception.getMessage());
	}
	
	@Test
	public void testDivide2By1_2() {
		assertEquals(2, calculator.calculate(2, 1, "/"));
	}
	
	@Test
	public void testDivide2By3_RoundsDown() {
		assertEquals(0, calculator.calculate(2, 3, "/"));
	}
	
	
	@Test
	public void testIvalidMethod_IAE() {
		
        Exception exception = assertThrows(
			IllegalArgumentException.class, 
			() -> calculator.calculate(2, 0, "invalid"));

        assertEquals("Invalid operator - invalid", exception.getMessage());
	}
	
}
