package com.techify.rohit.java.basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukariJobSearch {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
driver.get("https://www.naukri.com");
//driver.get("https://www.naukri.com");
//click on login
driver.findElement(By.id("login_Layer")).click();
//In new window enter field user name and password
driver.findElement(By.id("eLogin")).sendKeys("rohit.sharma@yahoo.com");
driver.findElement(By.id("pLogin")).sendKeys("ABCD");
driver.findElement(By.className("blueBtn")).click();
		//log-in naukri.com
		//log out naukri
	}

}
