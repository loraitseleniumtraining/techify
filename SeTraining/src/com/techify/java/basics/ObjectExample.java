package com.techify.java.basics;

public class ObjectExample {

	int a =10; // global variable
	
	public static void main(String[] args) {
		ObjectExample oe = new ObjectExample(); //syntax
		System.out.println(oe.a);
		oe.addNumbers();
	}
	
	public void addNumbers(){
		a=22;
		System.out.println(a);
	}

}
