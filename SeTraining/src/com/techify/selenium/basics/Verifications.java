package com.techify.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifications {

	public static void main(String[] args) {
		Verifications ob = new Verifications();
		ob.openApplication();
	}

	public void openApplication() {
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); // runtime poly
			// link
			driver.get("http://demo.nopcommerce.com/register");

			// enter search value
			if(driver.findElement(By.id("small-searchterms")).isDisplayed())
				driver.findElement(By.id("small-searchterms")).sendKeys("mobile");

			// click search button
			driver.findElement(By.xpath("//input[@value='Search']")).click();

			Thread.sleep(5000);
			
			boolean isResultDisplayed = driver.findElement(By.xpath("//div[contains(text(),'No products were found that matched your criteria.')]")).isDisplayed();
			
			if(isResultDisplayed)
				System.out.println("Message No products were found that matched your criteria is displayed");
			else
				System.out.println("Message No products were found that matched your criteria is NOT displayed");
			
			boolean isChecked = driver.findElement(By.xpath("//input [@id='adv']")).isDisplayed();
			System.out.println(isChecked);

			boolean isChecked1 = driver.findElement(By.xpath("//input [@id='adv']")).isEnabled();
			System.out.println(isChecked1);

			boolean isChecked2 = driver.findElement(By.xpath("//input [@id='adv']")).isSelected();
			System.out.println(isChecked2);
			
			// close browser
			// driver.close();
			//driver.quit();
		} catch (Exception e) {
			System.out.println("Error occured");
		}

	}

}
