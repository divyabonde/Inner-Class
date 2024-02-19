package com.java.inner;

// Outer class
class Outer {
	private int outerData;
	
	//Constructor
	public Outer(int data) {
		this.outerData = data;
	}
	
	//Inner class
	class Inner{
		void display() {
			System.out.println("Outer Data:" + outerData);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		//create an instance of the outer class
		Outer outerObject = new Outer(10);
		
		//Create an instance of the inner class using the outer class instance
		Outer.Inner innerObject = outerObject.new Inner();
		
		//Access the method of the inner class
		innerObject.display();
	}

}
