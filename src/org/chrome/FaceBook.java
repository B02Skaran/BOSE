package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement usernamebox = driver.findElement(By.id("email"));
	usernamebox.sendKeys("Baskaran");
	
	
	
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
