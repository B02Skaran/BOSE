package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
   driver.manage().window().maximize();
	Thread.sleep(5000);
    WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
	WebElement scrooldown2 = driver.findElement(By.id("nav-logo-sprites"));
	executor.executeScript("arguments[0].scrollIntoView(false)", scrooldown2);
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
