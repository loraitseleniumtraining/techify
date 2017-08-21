package com.techify.selenium.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeExample {

	public static void main(String[] args) {
		WaitTimeExample ob = new WaitTimeExample();
		ob.openApplication();
	}

	public void openApplication() {
		try{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // runtime poly
		// link
		driver.get("http://demo.nopcommerce.com");
		//implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		
		//explicit wait
/*		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));
*/		// selecting gender
		driver.findElement(By.id("gender-male")).click();
		
		}catch(Exception e){
			System.out.println("Error in registering");
		}
		
	}

}
