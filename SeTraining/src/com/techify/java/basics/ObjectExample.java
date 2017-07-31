package com.techify.java.basics;

import com.techify.java.oops.AccessModifiers2;

public class ObjectExample {

	int a =10; // global variable
	
	public static void main(String[] args) {
		ObjectExample oe = new ObjectExample(); //syntax
		System.out.println(oe.a);
		oe.addNumbers();
		AccessModifiers2 am = new AccessModifiers2();
		//System.out.println(am.);
	}
	
	public void addNumbers(){
		a=22;
		System.out.println(a);
	}

}
