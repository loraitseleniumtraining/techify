package com.techify.raju.java.basics;

public class Student012 extends AbstractExample1{
	

	public static void main(String[] args) {
		AbstractExample1 ex =new Student012();
		ex.show();
		
		AbstractExample1 ex1 =new Student012();
		ex.show1();
        
		AbstractExample1 ex2 =new Student012();
		ex.show2();

	}

	@Override
	void show() {
		System.out.println("this is raju nani");
	
	}
     
	void show1(){
	      System.out.println("this is praven kumar");
	
}

     void show2(){
	      System.out.println("this is mani");
}
}


