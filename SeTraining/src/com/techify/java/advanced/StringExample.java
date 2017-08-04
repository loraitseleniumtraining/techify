package com.techify.java.advanced;

public class StringExample {

	public static void main(String[] args) {
		StringExample sm = new StringExample();
		sm.testMethod();
	}

	public void testMethod(){
		String name = "Kiran";
		System.out.println(name);
		System.out.println(name.length());
		
		String anotherName = "Kishan";
		
		if(name == anotherName)
			System.out.println("Both are equal");
		else
			System.out.println("Both NOT are equal");
		
		if(name.equals(anotherName))
			System.out.println("Both are equal");
		else
			System.out.println("Both NOT are equal");
		
		for(int i=0;i<name.length();i++)
			System.out.println(name.charAt(i));
		
		for(int i=name.length()-1;i>=0;i--)
			System.out.print(name.charAt(i));
	
		String tagLine = "He is very good boy";
		
		String display[] = tagLine.split(" ");
		
		for(int i=0;i<display.length;i++)
			System.out.println(display[i]);
		
		for(int i=display.length-1;i>=0;i--){
			System.out.print(display[i]);
			System.out.print(" ");
		}
		System.out.println();
		String firstName = "Raju";
		int age = 26;
		
		System.out.println(firstName+"'s age is "+age);
		System.out.println(name.concat(firstName));
		if(name.contains("Kir"))
			System.out.println("True");
		else
			System.out.println("false");
	}
	
}
