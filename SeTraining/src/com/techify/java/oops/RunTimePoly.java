package com.techify.java.oops;

public class RunTimePoly extends RunTimePolyAnother {

	public void getParentMethod(){
		super.testB();
	}
	
	public static void main(String[] args) {
		RunTimePoly rt = new RunTimePoly();
		rt.testB();
		rt.getParentMethod();
		
		RunTimePolyAnother rpa = new RunTimePoly();
		rpa.testB();
	}

	public void testA() {
		System.out.println("A");
	}

	public void testB() {
		System.out.println("CB");
	}
}
