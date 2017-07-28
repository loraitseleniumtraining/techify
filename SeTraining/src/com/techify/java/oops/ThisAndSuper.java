package com.techify.java.oops;

public class ThisAndSuper extends ThisAndSuper2 {

	int a=10;
	
	public void printAValue(){
		System.out.println(this.a);
		System.out.println(super.a);
		this.addNumbers();
		super.addNumbers();
	}
	
	public static void main(String[] args) {
		ThisAndSuper ts = new ThisAndSuper();
		ts.printAValue();
	}

	public void addNumbers(){
		System.out.println("child + test");
	}
	
	public void subNumbers(){
		System.out.println("subNumbers");
	}
	
	public void multiNumbers(){
		System.out.println("multiNumbers");
	}
	
}
