package com.techify.java.oops;

public class ConstructorOverloading {
	
	public static void main(String[] args) {
		ConstructorOverloading ce = new ConstructorOverloading();
		ConstructorOverloading ce1 = new ConstructorOverloading(30);
		ConstructorOverloading ce2 = new ConstructorOverloading(30,40);
	}

	//constructor
	public ConstructorOverloading(){
		System.out.println("in Constructor");
	}
	
	// parameterized constructor
	public ConstructorOverloading(int a){
		System.out.println("in Constructor "+a);
	}
	
	// parameterized constructor
	public ConstructorOverloading(int a, int b) {
		System.out.println("in Constructor " + a + b);
	}

}
