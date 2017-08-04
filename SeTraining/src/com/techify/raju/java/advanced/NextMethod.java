package com.techify.raju.java.advanced;

public class NextMethod extends AbstExample {

	@Override
	public void testMethod() {
		System.out.println("Hello");
	}

	public static void main(String args[]){
		AbstExample ae = new NextMethod();
		ae.testMethod();
	}
	
	
}
