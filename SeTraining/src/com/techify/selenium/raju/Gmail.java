package com.techify.selenium.raju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail {
	public static void main(String[]args){
		Gmail gmail=new Gmail();
		gmail.openApplication();
	}
public void openApplication(){
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\SeTraining\\src\\lib\\geckodriver.exe");
     WebDriver driver=new FirefoxDriver(); 
     
     //link
     
driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Raju");
driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("nani");
driver.findElement(By.xpath("//input[@name='GmailAddress']")).sendKeys("rajuramadugu033@gmail.com");
driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("rajunani");
driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("rajunani");
driver.findElement(By.xpath("//input[@name='BirthDay']")).sendKeys("11");
driver.findElement(By.xpath("//input[@name='BirthDay']")).sendKeys("11");
driver.findElement(By.xpath("//input[@name='BirthYear']")).sendKeys("1993");
driver.findElement(By.xpath("//input[@name='RecoveryEmailAddress']")).sendKeys("praveenkumar2222@gmail.com");





}
}


