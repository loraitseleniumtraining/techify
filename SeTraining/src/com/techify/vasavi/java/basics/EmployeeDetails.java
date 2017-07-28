package com.techify.vasavi.java.basics;


public class EmployeeDetails {
	
	
		String empName;
		String empRole;
		String movie;

		public static void main(String[] args) {
			Bahubali();
			System.out.println("--------------------");
			
			EmployeeDetails dir = new EmployeeDetails();
			dir.empName = "rajmouli";
			dir.empRole = "director";
			dir.film();
			EmployeeDetails hero = new EmployeeDetails();
			hero.empName = "prabhas";
			hero.empRole = "hero";
			hero.film();
			EmployeeDetails villan = new EmployeeDetails();
			villan.empName = "Rana daggubati";
			villan.empRole = "villan";
			villan.film();
			EmployeeDetails her = new EmployeeDetails();
			her.empName = "Anushka";
			her.empRole = "heroine";
			her.film();
			
			
		}
		public void film(){
			 
			System.out.println(empName+" | "+empRole);
			System.out.println("--------------------");
		//	System.out.println()
			}
		public static void Bahubali(){
			 
			System.out.println("Film Crew");
			
			}
		
	


}

	