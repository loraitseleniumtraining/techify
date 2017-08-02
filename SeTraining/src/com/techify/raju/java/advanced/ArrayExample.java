package com.techify.raju.java.advanced;

public class ArrayExample {

	public static void main(String[] args) {
		ArrayExample Ae= new ArrayExample();
				
			Ae.display();
				
	}
		public void display(){
			int a[]={10,20,30,40,50};
			System.out.println(a.length);
			System.out.println(a[0]);
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}
		
		
		
	}


