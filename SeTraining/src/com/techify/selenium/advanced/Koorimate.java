package com.techify.selenium.advanced;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

public class Koorimate {

	public static void main(String[] args) {
		Koorimate ob = new Koorimate();
		ob.openApplication();
	}

	@Test
	public void openApplication() {
		try {
			ExtentReports extent = new ExtentReports("C:\\Users\\Techifynow\\Desktop\\Results\\Test.html", false);
			ExtentTest test = extent.startTest("Create Project", "This test will create project");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); // runtime poly
			// link
			driver.get("http://akha.koordimate.com/#/Home/Login");
			// implicit wait
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			boolean isPageDisplayed = driver.findElement(By.id("username")).isDisplayed();
			if (isPageDisplayed)
				test.log(LogStatus.PASS, "Home page is displayed");
			else
				test.log(LogStatus.FAIL, "Home page is NOT displayed");
			
			boolean isPasswordDisplayed = driver.findElement(By.id("password")).isDisplayed();
			if (isPasswordDisplayed)
				test.log(LogStatus.PASS, "Password textbox is displayed");
			else
				test.log(LogStatus.FAIL, "Password textbox is NOT displayed");
			
			driver.findElement(By.id("username")).sendKeys("mani");
			driver.findElement(By.id("password")).sendKeys("abc");
			test.log(LogStatus.INFO, "Entered user name and password");
			
			try{
				boolean loginDisplayed = driver.findElement(By.id("login-submitmanivasavi")).isDisplayed();
				if (loginDisplayed)
					test.log(LogStatus.PASS, "Login button is displayed");
			}catch(Exception e){
				//selenium screen
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyDirectory(file, new File("C:\\Users\\Techifynow\\Desktop\\Results\\Screenshots"));
				
				//extent screenshot
				test.log(LogStatus.FAIL, "Login button is NOT displayed"+test.addScreenCapture("C:\\Users\\Techifynow\\Desktop\\Results\\Screenshots\\Test.png"));
			}
			
			// ending test
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			System.out.println("Error in registering" + e.getMessage());
		}

	}

}
