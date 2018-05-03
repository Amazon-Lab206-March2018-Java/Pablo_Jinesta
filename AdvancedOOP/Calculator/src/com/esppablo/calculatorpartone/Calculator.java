package com.esppablo.calculatorpartone;

public class Calculator implements CalcInterface{
	
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double result;

	public Calculator() {
	}
	
	// getters and setters 
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandOne() {
		return operandOne;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getOperation() {
		return operation;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public void setResult(double result) {
		this.result = result;
	}
	public double getResult() {
		return result;
	}

	@Override
	public void performOperation() {
		// TODO sum of x and y 
		if (this.operation == "+") {
			result = this.operandOne + this.operandTwo;
		} 
		// TODO difference of x and y
		else if (this.operation == "-") {
			result = this.operandOne - this.operandTwo;
		} 
	}

	@Override
	public double getResults() {
		// TODO Auto-generated method stub
		return result;
	}
}