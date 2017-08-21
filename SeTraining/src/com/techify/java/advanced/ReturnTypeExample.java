package com.techify.java.advanced;

public class ReturnTypeExample {
	ReturnTypeExample raju;
	static int age = 10;
	
	public static void main(String[] args) {
		ReturnTypeExample rte = new ReturnTypeExample();
		rte.display().addNumbers(6, 11);
		//rte.test().
	}

	public ReturnTypeExample display() {
		ReturnTypeExample x = new ReturnTypeExample();
		String name = "raju";
		System.out.println(name);
		return x;
	}
	
	public static void addNumbers(int a, int b){
		System.out.println(age);
		int c= a+b;
		System.out.println(c);
	}
	
	public ReturnTypeExample test(){
		return null;
	}
	
}
