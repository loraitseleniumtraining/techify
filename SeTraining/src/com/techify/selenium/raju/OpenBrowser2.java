package com.techify.selenium.raju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser2 {
	public static void main(String[] args) {

		OpenBrowser2 ob = new OpenBrowser2();
		ob.openApplication();
	}
	

	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		// link
		driver.get("https://www.facebook.com/");
		// entering first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		// entering Sure name
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Ramadugu");
		// entering Mobile number
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9959874759");
		// enter Password
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("rajunan");
		//driver.findElement(By.id("FirstName")).sendKeys("Raju");

		
	}



	
	
	
	


	}


