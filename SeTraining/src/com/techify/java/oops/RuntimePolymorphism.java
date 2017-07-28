package com.techify.java.oops;

public class RuntimePolymorphism extends ThisAndSuper{

	public static void main(String[] args) {
		RuntimePolymorphism rp = new RuntimePolymorphism();
		rp.addNumbers();
	}
	
	
	public void addNumbers(){
		System.out.println("in RuntimePolymorphism");
	}

}
