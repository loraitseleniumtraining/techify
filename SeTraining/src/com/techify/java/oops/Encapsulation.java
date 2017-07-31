package com.techify.java.oops;

public class Encapsulation {

	private int a;
	
	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		e.setAValue(10);
		System.out.println(e.getAValue());
	}
	
	public void setAValue(int x){
		this.a = x;
	}

	public int getAValue(){
		return a;
	}
}
