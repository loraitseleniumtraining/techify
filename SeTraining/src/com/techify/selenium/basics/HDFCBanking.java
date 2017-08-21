package com.techify.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techify.page.elements.HdfcPageElements;


public class HDFCBanking {

	WebDriver driver ;
	
	public static void main(String[] args) {
		
		HDFCBanking ob = new HDFCBanking();
		ob.openApplication();
	}

	public  void clickElement(By value){
		driver.findElement(value).click();
	}
	
	public  void enterData(By value,String testData){
		driver.findElement(value).sendKeys(testData);
	}

	public void openApplication() {
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
			driver = new FirefoxDriver(); // runtime poly
			// link
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			
			//switch to frame
			/*//way 1
			driver.switchTo().frame(0);
			
			//way 2
			driver.switchTo().frame("login_page");*/
			
			//way 3
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(HdfcPageElements.frame));
			driver.switchTo().frame(driver.findElement(HdfcPageElements.frame));

			//enter text value and clear the text
			enterData(HdfcPageElements.customerId,"22222222");
			driver.findElement(HdfcPageElements.customerId).clear();
			
			//click on continue
			driver.findElement(By.xpath("//img[@alt='continue']")).click();
			
			//Interactions with popup / alerts
			String alertText = driver.switchTo().alert().getText();
			System.out.println(alertText);
			driver.switchTo().alert().accept();
			
			//come out of the frame
			driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			System.out.println("Error occured");
		}

	}
	

}
