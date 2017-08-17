package com.techify.rohit.java.basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathExample {

	public static void main(String[] args){
WebDriver driver = new FirefoxDriver();
//open the url
driver.get("http://demo.nopcommerce.com");
//click on the computers
driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/computers']")).click();
//click on the Desktop
try {
	driver.findElement(By.xpath("//h2[@class='title']//a[@href='/desktops']")).click();
	//Selecting from drop-down
	Thread.sleep(5000);
	Select SelectOption = new Select(driver.findElement(By.id("products-orderby")));
	SelectOption.selectByVisibleText("Price: Low to High");
	System.out.println(SelectOption);
	driver.findElement(By.className("PriceRange")).click();
} catch (Exception e) {
	System.out.println("Error occuced"+e);
}
driver.close();
	}

}
