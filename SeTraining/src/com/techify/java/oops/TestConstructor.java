package com.techify.java.oops;

public class TestConstructor {
	
	public TestConstructor(){
		System.out.println("Default Constructor");
	}
	
	TestConstructor(int a){
		System.out.println("Param Constructor: "+a);
	}

	
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor(1);
	}

}
