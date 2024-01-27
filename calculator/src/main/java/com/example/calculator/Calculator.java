package com.example.calculator;

public class Calculator {

	public int calculate(int i, int j, String method) {
		
		if (method.equals("+")) {
			return i + j;
		}
		else if (method.equals("-")) {
			return i - j;
		}
		else if (method.equals("/")) {
			if (j == 0) {
				throw new IllegalArgumentException("Cannot divide by zero");
			}
			return i / j;
		} 
		else {
			throw new IllegalArgumentException("Invalid operator - " + method);
		}
	}

}
