package com.techify.java.oops;

public class InterfaceExample1 implements InterfaceExample {

	public static void main(String args[]){
		InterfaceExample ie = new InterfaceExample1();
		ie.addNumebers();
		InterfaceExample1 ie1 = new InterfaceExample1();
		ie1.testXYZ();
	}
	
	@Override
	public void addNumebers() {
		System.out.println("add");
		
	}

	@Override
	public void subNumbers() {
		System.out.println("Sub");
		
	}
	
	public void testXYZ(){
		
	}

}
