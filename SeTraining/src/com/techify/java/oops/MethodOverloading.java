package com.techify.java.oops;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.addNumbers(5, 6);
		mo.addNumbers(5, 6, 7);
	}
	
	public void addNumbers(int a, int b){
		System.out.println(a+b);
	}
	
	public void addNumbers(int a, float b){
		System.out.println(a+b);
	}

	public void addNumbers(int a,int b, int c){
		System.out.println(a+b+c);
	}
}
