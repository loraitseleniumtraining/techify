package com.techify.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAcc {

	public static void main(String[] args) {
		GmailAcc ob = new GmailAcc();
		ob.openApplication();
	}

	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // runtime poly
		// link
		driver.get("http://gmail.com/");
		
		driver.findElement(By.xpath("//div[text()='More options']")).click();
		driver.findElement(By.xpath(".//*[@id='SIGNUP']/div")).sendKeys(Keys.ENTER);
		
		// select month
/*		driver.findElement(By.xpath("//div[text()='Month']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//div[text()='April']")).click();
*/	}

}
