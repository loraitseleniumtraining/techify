package com.techify.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		OpenBrowser ob = new OpenBrowser();
		ob.openApplication();
	}

	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // runtime poly
		// open app
		driver.get("http://demo.nopcommerce.com");
		
		//click on the register link
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		// selecting gender
		driver.findElement(By.id("gender-male")).click();

		// entering first name
		driver.findElement(By.id("FirstName")).sendKeys("Mani");

		// entering last name
		driver.findElement(By.name("LastName")).sendKeys("Kanta");

		// entering email
		driver.findElement(By.id("Email")).sendKeys("manikanta@gmail.com");

		// entering company name
		driver.findElement(By.id("Company")).sendKeys("CTS");

		// entering company name
		driver.findElement(By.id("Newsletter")).click();

		// entering password
		driver.findElement(By.id("Password")).sendKeys("1234qwer");

		// entering confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234qwer");
	}

}
