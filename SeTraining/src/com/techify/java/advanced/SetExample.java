package com.techify.java.advanced;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>(); 
		names.add("Kishan");
		names.add("Kiran");
		names.add("Raju");
		
		for(String name: names){
			System.out.println(name);
		}
	}

}
