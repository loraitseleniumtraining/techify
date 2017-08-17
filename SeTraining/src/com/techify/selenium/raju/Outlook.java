package com.techify.selenium.raju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.techify.selenium.raju.Outlook;

public class Outlook {

	public static void main(String[] args) {
	
		Outlook outlook=new Outlook();
		outlook.openApplication();

	}

	private void openApplication() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\SeTraining\\src\\lib\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver(); 
	     
	     
	     //link
	     driver.get("https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=13&ct=1502991477&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26signup%3d1%26RpsCsrfState%3d96138da3-5f3f-0765-3ded-b6df423733c1&id=292841&CBCXT=out&fl=wld&cobrandid=90015&uaid=1b113142499b41baa9f0d033d7b7b130&lic=1");
	     driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Praveen");
         driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Varma");
         driver.findElement(By.xpath("//input[@id='MemberName']")).sendKeys("9989nani@outlook.com");
	     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nani@1220");
	     driver.findElement(By.xpath("//input[@name='RetypePassword']")).sendKeys("nani@1220");
	}
	
	


}