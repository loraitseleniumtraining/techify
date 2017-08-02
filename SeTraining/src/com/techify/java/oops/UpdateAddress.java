package com.techify.java.oops;

public class UpdateAddress extends TestEmployee {
	
	public static void main(String args[]){
		TestEmployee te = new UpdateAddress(); // runtime poly
		te.empAdress();
		te.testName();
		UpdateAddress ua = new UpdateAddress();
		
	}

	@Override
	public void empAdress() {
		System.out.println("Test");
	}
	
	public void printMyName(){
		
	}

	@Override
	public void testName() {
		// TODO Auto-generated method stub
		
	}
	
	
}
