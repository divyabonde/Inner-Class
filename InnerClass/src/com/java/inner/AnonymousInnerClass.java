package com.java.inner;

interface Greeting {
	void greet();
}

public class AnonymousInnerClass {

	public void greetUser() {
		Greeting greeting = new  Greeting() {
			
			@Override
			public void greet() {
				System.out.println("Hello, User!!!");
			}
		};
		
		greeting.greet();
	}
	public static void main(String[] args) {
		AnonymousInnerClass aInnerClass = new AnonymousInnerClass();
		aInnerClass.greetUser();
	}

}
