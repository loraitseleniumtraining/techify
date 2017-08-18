package com.techify.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		GoogleSearch ob = new GoogleSearch();
		ob.openApplication();
	}

	public void openApplication() {
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); // runtime poly
			// link
			driver.get("http://www.google.co.in");
			
			//enter text value
			driver.findElement(By.id("lst-ib")).sendKeys("te");
			
			Thread.sleep(5000);
			
			//very regular
			int numberOfResults = driver.findElements(By.xpath("//ul[@class='sbsb_b' and @role='listbox']/li")).size();
			
			for(int i=1;i<=numberOfResults-2;i++){
				String text = driver.findElement(By.xpath("//ul[@class='sbsb_b' and @role='listbox']/li["+i+"]/div/div[2]")).getText();
				System.out.println(text);
			}

		} catch (Exception e) {
			System.out.println("Error occured");
		}

	}

}
