package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	WebElement texpara = driver.findElement(By.xpath("//p[contains(text(),'A')]"));
	String data = texpara.getText();
	System.out.println(data);
	
	
	
	
	
}
}
