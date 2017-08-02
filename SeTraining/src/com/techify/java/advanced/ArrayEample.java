package com.techify.java.advanced;

public class ArrayEample {

	public static void main(String[] args) {
		ArrayEample sm = new ArrayEample();
		/*sm.testMethod();
		sm.testMethod1();*/
		sm.testMethod2();
	}

	public void testMethod(){
		int a[] = {10,20,30,40,50};
		
		System.out.println(a.length);
		//System.out.println(a[0]);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	public void testMethod1(){
		float a[] = {10,20,30,40,50};
		
		System.out.println(a.length);
		//System.out.println(a[0]);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	public void testMethod2(){
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
  		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
}
