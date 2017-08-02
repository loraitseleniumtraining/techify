package com.techify.java.oops;

public class ExampleonThis extends ExampleParent {

	public int a = 100;
	
	public void getA(){
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		ExampleonThis e = new ExampleonThis();
		e.getA();
	}

}
