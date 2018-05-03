package com.esppablo.calculatorpartone;

public class CalcTest {

	public static void main(String[] args) {
		Calculator calculate = new Calculator();
		
		// Sum 10.5 + 5.2 = 15.7
		calculate.setOperandOne(10.5);
		calculate.setOperation("+");
		calculate.setOperandTwo(5.2);
		calculate.performOperation();
		
		// Difference 10.5 - 5.2 = 15.7
		calculate.setOperandOne(10.5);
		calculate.setOperation("-");
		calculate.setOperandTwo(5.2);
		calculate.performOperation();
		
		// Get Results Sum of x and y:
		System.out.println("Sum of x and y:");
		System.out.println("10.5 + 5.2 = " + calculate.getResults());
		
		System.out.println("\n#######################\n");
		
		// Get Results Difference of x and y
		System.out.println("Difference of x and y:");
		System.out.println("10.5 - 5.2 = " + calculate.getResults());
		
	}

}
