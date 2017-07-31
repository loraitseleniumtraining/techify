package com.techify.java.oops;

public class RunTimePoly1 extends RunTimePoly2{

	public static void main(String[] args) {
		RunTimePoly1 rp = new RunTimePoly1();
		
		RunTimePoly2 rp1 = new RunTimePoly1();
		rp1.testB();
		
	}
	
	public void testA(){
		System.out.println("A");
	}

}
