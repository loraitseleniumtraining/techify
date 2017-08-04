package com.techify.java.advanced;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListExample ae = new ArrayListExample();
		ae.testMethod();
	}

	public void testMethod(){
		ArrayList<String> names = new ArrayList<String>(); // create object for array list of string
		
		// adding values
		names.add("Kishan");
		names.add("Kiran");
		names.add("Raju");
		names.add("Hari");
		
		// get values from array list
		System.out.println(names); // print whole arraylist
		System.out.println(names.size()); // get number of values in the arraylist
		
		// to get the first value in array list
		System.out.println(names.get(0));
		
		// to get the second value
		System.out.println(names.get(1));
		
		// to get the third value
		System.out.println(names.get(2));
		
		System.out.println("=============For loop starting=========");
		// for loop
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
		
		names.remove(2);
		names.add(0, "Mani");
		System.out.println("=============For each loop starting=========");
		// for each
		for(String student: names){
			System.out.println(student);
		}
	}

	
}
