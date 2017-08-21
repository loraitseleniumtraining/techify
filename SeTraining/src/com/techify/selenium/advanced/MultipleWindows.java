package com.techify.selenium.advanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) {
		MultipleWindows ob = new MultipleWindows();
		ob.openApplication();
	}

	public void openApplication() {
		try{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\SeTraining\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // runtime poly
		// link
		driver.get("https://www.makemytrip.com/");
		//implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='log-in']")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='ch_login_google']")).click();
/*		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("arguments[0].click;", driver.findElement(By.xpath(".//*[@id='ch_login_google']")));
*//*		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath(".//*[@id='ch_login_google']"))).build().perform();
*/		//driver.findElement(By.xpath(".//*[@id='ch_login_google']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Number of windows "+windows.size());
		System.out.println(windows.toArray()[0].toString());
		System.out.println(windows.toArray()[1].toString());
		/*for(String window: windows)
			driver.switchTo().window(window);*/
		driver.switchTo().window(windows.toArray()[1].toString());
		
		driver.findElement(By.id("identifierId")).sendKeys("xyz@gmail.com");
		
		driver.switchTo().window(windows.toArray()[0].toString());
		driver.findElement(By.id("ch_login_email")).sendKeys("xyz@gmail.com");
		
		//driver.close(); - current window
		//driver.quit(); - all windows
		}catch(Exception e){
			System.out.println("Error in registering" +e.getMessage());
		}
		
	}

}
