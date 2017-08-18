package com.techify.selenium.basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		SelectExample ob = new SelectExample();
		ob.openApplication();
	}

	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // runtime poly
		// link
		driver.get("http://demo.nopcommerce.com");

		// select dropdown value
		Select selectCurrent = new Select(driver.findElement(By.id("customerCurrency")));
		WebElement firstValue = selectCurrent.getFirstSelectedOption();
		System.out.println(firstValue.getText());

		//
		System.out.println("Printing all values");
		List<WebElement> options = selectCurrent.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}

		// select euro
		selectCurrent.selectByVisibleText("Euro");

		// mouse over
		Actions vasavi = new Actions(driver);
		vasavi.moveToElement(driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[2]/a"))).build().perform();
	}

}
