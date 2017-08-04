package com.techify.java.advanced;

public class FinalExample {

	public static final int a = 10;
	
	public static void main(String[] args) {
		FinalExample Ae = new FinalExample();
		Ae.display();
	}

	public void display() {
		// a= 20;  -- final variables cannot be changed
		System.out.println(a);
	}
	
}
