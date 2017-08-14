package com.techify.java.basics;

public class StaticExample {

	static int a =10; // global variable
	
	int x;
	public static void main(String[] args) {
		
		System.out.println(a);
		addNumbers();
		
		StaticExample xyz = new StaticExample();
		xyz.subNumbers();
	}
	
	public static void addNumbers(){
		int a=10; // local variable
		int b= 20;
		int c;
		System.out.println(a+b);
		//System.out.println(c); // local variable 'c' must be initialized
	}
	

	public void subNumbers(){
		int a=10;
		int b= 20;
		System.out.println(b-a);
		System.out.println(x);
	}
	
	
	
}
