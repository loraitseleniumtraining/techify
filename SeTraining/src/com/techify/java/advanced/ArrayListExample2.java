package com.techify.java.advanced;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayListExample2 ae = new ArrayListExample2();
		ae.testMethod();
	}

	public void testMethod(){
		List<Integer> ages = new ArrayList<Integer>(); // runtime ploy
		
		ages.add(20);
		ages.add(26);
		ages.add(35);
		
		for(int i: ages){
			System.out.println(i);
		}
 	}

	
}
