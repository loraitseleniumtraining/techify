package com.techify.selenium.basics;

import org.openqa.selenium.By;
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
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.co.in%2F%3Fgfe_rd%3Dcr%26ei%3D22yWWe-1N_PI8Ae9-bP4BQ%26gws_rd%3Dssl&hl=en");

		// select month
		driver.findElement(By.xpath("//div[text()='Month']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//div[text()='April']")).click();
	}

}
