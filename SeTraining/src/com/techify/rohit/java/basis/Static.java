package com.techify.rohit.java.basis;

public class Static{
	static String bike="bajaj";
 int Model= 2012;//Instance variable
	String Cubiccapacity= "100cc";
	public static void main(String[] args) {
		System.out.println(bike);
		Static Sta = new Static();
		System.out.println(Sta.Model);
		System.out.println(Sta.Cubiccapacity);
Static Sta1 = new Static();
Static Mod1 = new Static();
Mod1.Model=2013+1;
System.out.println(Mod1.Model);
System.out.println(Sta1.Cubiccapacity);
}
}
	
