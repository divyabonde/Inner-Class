package com.java.inner;

public class LocalInnerClass {

	private int number;
	
	public LocalInnerClass(int number) {
		this.number = number;
	}
	
	public void operations() {
		class Arithmetic {
			
			public int add(int x) {
				return number + x;
			}
			
			public int subtract(int x) {
				return number - x;
			}
			
			public int multiply(int x) {
				return number * x;
			}
			
			public int divide(int x) {
				return number / x;
			}
		}
		
		Arithmetic arithmetic = new Arithmetic();
		
		System.out.println("Addition: " + arithmetic.add(5));
		System.out.println("Subtraction: " + arithmetic.subtract(3));
		System.out.println("Multiplication: " + arithmetic.multiply(4));
		System.out.println("Division: " + arithmetic.divide(2));
	}
	public static void main(String[] args) {
		LocalInnerClass localInnerClass = new LocalInnerClass(10);
		localInnerClass.operations();
	}

}
