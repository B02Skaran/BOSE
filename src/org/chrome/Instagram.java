package org.chrome;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
    Thread.sleep(5000);
	WebElement usernamebox = driver.findElement(By.name("username"));
	usernamebox.sendKeys("baskar0202");
	WebElement passwordbox = driver.findElement(By.name("password"));
	passwordbox.sendKeys("Baskaran2&");
	WebElement clkbtn = driver.findElement(By.xpath("//div[text()='Log In']"));
	clkbtn.click();
	Thread.sleep(5000);
	WebElement notnowbtn = driver.findElement(By.xpath("//button[text()='Not Now']"));
	notnowbtn.click();
	WebElement inststry = driver.findElement(By.xpath("(//img[@class='_6q-tv'])[2]"));
	inststry.click();
	driver.navigate().back();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    String title = driver.getTitle();
    System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
	
	
	
}
	
	
	
	
	
	
	
}
