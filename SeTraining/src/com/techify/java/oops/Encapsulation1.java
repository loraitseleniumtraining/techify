package com.techify.java.oops;

public class Encapsulation1 {

	private float mySalary = 10.6f;
	
	public static void main(String[] args) {
		
		Encapsulation1 e = new Encapsulation1();
		System.out.println(e.mySalary);
	}
	
	public void setMySalary(float x){
		this.mySalary = x;
	}
	
	public float getMySalary(){
		return mySalary;
	}
}
