package com.techify.selenium.raju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commerce {
	public void openApplication(){
		System.setProperty("Webdriver.gecko.driver",System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com");
		//driver.findElement(By.xpath("//a[@class='ico-register']"));
        //driver.findElement(By.xpath("//a[@class='ico-login']"));
        driver.findElement(By.xpath("//span[@class='wishlist-label']")).click();
		
		
	}

}
