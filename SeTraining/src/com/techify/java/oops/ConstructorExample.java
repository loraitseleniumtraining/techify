package com.techify.java.oops;

public class ConstructorExample {
	
	public void testMethod(){
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {

		ConstructorExample ce = new ConstructorExample();
		System.out.println("Hello");
	}


	//constructor
	public ConstructorExample(){
		System.out.println("in Constructor");
	}
	
}
