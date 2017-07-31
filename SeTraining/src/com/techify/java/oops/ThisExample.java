package com.techify.java.oops;

public class ThisExample extends ThisExample2 {

	int a = 100;
	
	public void printValue(){
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		ThisExample te = new ThisExample();
		te.printValue();
		

	}

}
