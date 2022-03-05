package org.chrome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandles {
 public static void main(String[] args, Collection<? extends String> allwindows) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	 
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	 WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	 searchbox.sendKeys("iphone",Keys.ENTER);
	 WebElement phone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 12 (64GB) - Green'])[1]"));
	 phone.click();
	 
	/*  String parentID = driver.getWindowHandle();
	 System.out.println(parentID);
	 
	 Set<String> allwindows = driver.getWindowHandles();
	 System.out.println(allwindows);
	 
	 for (String string : allwindows) {
		
		 System.out.println(!string.equals(parentID));
		 
		 if (!string.equals(parentID)) {
			 driver.switchTo().window(string);
			 }*/
	 
	/*interview Switching more then one window 
	 String parentID = driver.getWindowHandle();
	 Set<String> allwindows = driver.getWindowHandles();
	 int count=0;
	 for (String string : allwindows) {
		if (count==4) {
			driver.switchTo().window(string);
		}
		count++;
	}*/
	 
	//without looping condition
	 String parentID = driver.getWindowHandle();
	 Set<String> allwindows1 = driver.getWindowHandles();
	 
	 List<String>li=new ArrayList<>();
	 li.addAll(allwindows1);
	 driver.switchTo().window(li.get(3));
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
