package org.chrome;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUtils {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");		
WebDriver driver = new ChromeDriver();		
driver.manage().window().maximize();		
driver.get("https://www.facebook.com/login/");		
WebElement usernamebox = driver.findElement(By.id("email"));		
usernamebox.sendKeys("Baskaran");		
File s = usernamebox.getScreenshotAs(OutputType.FILE);		
File desk = new File("E:\\bose\\Bose.xlsx\\Bose.png");		
		
		
		
		
		
		
		
		
		
	}
	}


