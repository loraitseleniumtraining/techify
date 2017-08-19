package com.techify.page.elements;

import org.openqa.selenium.By;

public class HomePage {
	
	public static final By register = By.xpath("//a[text()='Register']");
	public static final By login = By.xpath("//a[text()='Log in']");
	public static final By wishList = By.xpath("//a[text()='Wishlist']");
	public static final By shoppingCart = By.xpath("//span[text()='Shopping cart']");
	public static final By currencyDropDown = By.id("customerCurrency");
}
