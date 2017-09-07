package com.techify.selenium.advanced;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Koorimate {

	public static void main(String[] args) {
		Koorimate ob = new Koorimate();
		ob.openApplication();
	}

	@Test
	public void openApplication() {
		try {
			ExtentReports extent = new ExtentReports("C:\\Users\\Techifynow\\Desktop\\Results\\Test.html", true);
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

			try {
				boolean loginDisplayed = driver.findElement(By.id("login-submitmanivasavi")).isDisplayed();
				if (loginDisplayed)
					test.log(LogStatus.PASS, "Login button is displayed");
			} catch (Exception e) {
				// extent screenshot
				String screenShot_Path = takeScreenShot(driver, "LoginPage_Screen");
				test.log(LogStatus.FAIL, "Login button is NOT displayed" + test.addScreenCapture(screenShot_Path));
			}

			// ending test
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			System.out.println("Error in registering" + e.getMessage());
		}

	}

	public static String takeScreenShot(WebDriver driver, String screenShotName) throws Exception {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		System.out.println("current Date " + strDate);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/Screenshots/" + screenShotName + "_" + strDate + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
	}

}
