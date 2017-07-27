package com.techify.raju.java.basics;

public class employee {
	public int id;
	public double salary;
	public String companyName;
	
	
	
public void  display(int id,double salary,String companyName){
	
	System.out.println(id);
	System.out.println(salary);
	System.out.println(companyName);}


public static void main(String[] args) {
	employee  emp = new employee();
	emp.display(1012,500.50,"ibm");
	

	}



}
