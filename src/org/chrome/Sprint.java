package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		
		
		Thread.sleep(10000);
		
		WebElement mouse = driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-1']"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(mouse).perform();
		WebElement mouse2 = driver.findElement(By.xpath("//span[text()='5G phones']"));
            Thread.sleep(70000);
		actions.moveToElement(mouse2).perform();
		
		WebElement txtPrint = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
		
		 String text = txtPrint.getText();
		 System.out.println(text);
	}

}
