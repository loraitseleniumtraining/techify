package com.techify.raju.java.advanced;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample Ae = new ExceptionExample();
		Ae.display();
	}

	public void display() {
		int a[] = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < a.length; i++) {
			try {
				System.out.println(a[i]);
				System.out.println(0 / 1);
			} catch (Exception e) {
				System.out.println("Error occured");
			} finally {
				System.out.println("In Final");
			}
		}
		System.out.println("Hi");
	}

}
