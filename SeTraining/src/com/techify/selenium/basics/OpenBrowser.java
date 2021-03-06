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
		// link
		driver.get("http://demo.nopcommerce.com");
		
		// click on register
		driver.findElement(By.linkText("Register")).click(); // by linktext
		// driver.findElement(By.partialLinkText("Regis")).click(); -- by partial (some part of the link text)
		//driver.findElement(By.className("ico-register")).click(); -- by class name
				
		// selecting gender
		driver.findElement(By.id("gender-male")).click();

		// entering first name
		driver.findElement(By.id("FirstName")).sendKeys("Mani");

		// entering last name
		driver.findElement(By.name("LastName")).sendKeys("Kanta");

		// entering email
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("manikanta@gmail.com");

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
