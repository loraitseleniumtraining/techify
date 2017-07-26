package com.techify.java.basics;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addNumbers(7,9,1);
		calc.subNumbers();
		int multi = calc.multiNumbers(3, 4);
		System.out.println(multi);
	}

	public void addNumbers(int a, int b, int d){
		int c = a+b+d;
		System.out.println(c);
	}
	
	public void subNumbers(){
		int a=40;
		int b=10;
		int c = a-b;
		System.out.println(c);
	}
	
	public int multiNumbers(int a, int b){
		int c = a*b;
		return c;
	}
	
}
