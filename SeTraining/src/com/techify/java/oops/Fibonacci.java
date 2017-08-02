package com.techify.java.oops;

public class Fibonacci {

	public static void main(String[] args) {
int a=0,b=1,c;
System.out.println(a);
c=a+b;
System.out.println(b);
while(c<20){
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);
}
	}

}
