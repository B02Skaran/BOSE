package org.chrome;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSample {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement username1 = driver.findElement(By.id("u_0_a_59"));
		username1.sendKeys("baskaran0202@gmail.com");
		
		TakesScreenshot username = (TakesScreenshot) driver;
		
		File s = username1.getScreenshotAs(OutputType.FILE);
		
		File dect = new File ("D:\\New folder\\fb.png");
		
		FileUtils.copyFile(s, dect);
		
	}
	
}
