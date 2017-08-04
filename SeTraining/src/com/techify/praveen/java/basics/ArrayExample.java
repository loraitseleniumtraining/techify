package com.techify.praveen.java.basics;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		
		ArrayExample arr =new ArrayExample();
				arr.showMethod();

			
	}
public void showMethod(){
	ArrayList<String>names=new ArrayList<String>();
	//adding values
	names.add("nani");
	names.add("raju");
	names.add("praveen");
	names.add("sri");
	
	System.out.println(names);
	System.out.println(names.size());
	System.out.println(names.get(0));
	System.out.println(names.get(1));
	System.out.println(names.get(2));
	for(int i=0;i<names.size();i++){
		System.out.println(names.get(i));
	}
		names.remove(0);
		names.add(1,"sjhsdjbsd");
	System.out.println(names);
	}
		
	


	
}

