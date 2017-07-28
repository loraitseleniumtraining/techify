package com.techify.java.oops;

public class Vehicle {

	Vehicle(int a){
		System.out.println("in con: " +a);
	}
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle(10);
		v.vehiclePerformance();
	}
	
	public void vehiclePerformance(){
		System.out.println("Good");
	}

}
