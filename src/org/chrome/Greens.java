package org.chrome;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		WebElement txtuser = driver.findElement(By.id("email"));
		
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dect = new File ("C:\\Users\\ADMIN\\Desktop\\New folder\\fb.png");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
