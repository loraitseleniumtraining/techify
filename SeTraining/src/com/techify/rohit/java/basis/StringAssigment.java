package com.techify.rohit.java.basis;

public class StringAssigment {

	public static void main(String[] args) {
		StringAssigment str = new StringAssigment();
       str.testmethod();
	}

	public void testmethod() {
		String name = "Hari28";
		System.out.println(("Hari age is "   +name.substring(4, 6)));
	}
}
