package com.techify.raju.java.basics;

public class Student {
	String name;
	double id;
	String schoolName;

	public void display(String name, double id, String schoolName) {
		System.out.println(name + " " + id + " " + schoolName);
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.display("praveen", 1220, "oxford");

	}

}
