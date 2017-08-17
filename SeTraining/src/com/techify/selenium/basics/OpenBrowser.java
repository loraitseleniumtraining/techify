package com.techify.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//mouse hover
		WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/computers']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(computer).build().perform();
	
		//click on the register link
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// selecting gender
		driver.findElement(By.id("gender-male")).click();

		// entering first name
		driver.findElement(By.id("FirstName")).sendKeys("Mani");

		// entering last name
		driver.findElement(By.name("LastName")).sendKeys("Kanta");
		
		//selecting from dropdown
		Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
		
		String firstOption = selectDay.getFirstSelectedOption().getText();
		System.out.println(firstOption);
		
		selectDay.selectByVisibleText("17");
		

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
