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

public class DateExample {

	public static void main(String[] args) {
		DateExample ob = new DateExample();
		ob.openApplication();
	}

	@Test
	public void openApplication() {
		try {
			takeScreenShot();
		} catch (Exception e) {
			System.out.println("Error in registering" + e.getMessage());
		}

	}

	public static void takeScreenShot() throws Exception {
		System.out.println(System.getProperty("user.dir"));
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		String strDate = formatter.format(date);
		System.out.println(strDate);
	}

}
