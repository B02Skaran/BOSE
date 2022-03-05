package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flickart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement inkcourses = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Actions actions =new Actions(driver);
	actions.moveToElement(inkcourses).perform();
	
}
}
