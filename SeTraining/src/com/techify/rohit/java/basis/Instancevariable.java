package com.techify.rohit.java.basis;

public class Instancevariable 
{
int i =100;
	public static void main(String[] args) {
Instancevariable obj = new Instancevariable();
Instancevariable obj1 = new Instancevariable();
obj.m1();
obj.i=200;
obj1.i=400;
System.out.println(obj.i);
System.out.println(obj1.i);
	}
private void m1(){
	System.out.println(i);
}
}
