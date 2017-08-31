package com.techify.java.advanced;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@BeforeTest
	public void sampleTest(){
		System.out.println("@BeforeTest");
	}
	
	@Test
	public void printName(){
		System.out.println("-----------------");
		System.out.println("@Test1");
		System.out.println("-----------------");
	}
	
	@Test
	public void printName1(){
		System.out.println("-----------------");
		System.out.println("@Test2");
		System.out.println("-----------------");
	}
	
	@BeforeSuite
	public void sampleMethod(){
		System.out.println("@BeforeSuite");
	}
	
	@AfterTest
	public void printNameAfter(){
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void printNameAfterSuite(){
		System.out.println("@AfterSuite");
	}
	
}
