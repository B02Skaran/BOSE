package org.chrome;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartWH {
 public static void main(String[] args) throws InterruptedException, IOException {

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 WebElement phone = driver.findElement(By.name("q"));
	phone.sendKeys("samsung",Keys.ENTER);
	 WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	 username.sendKeys("8939695989");
	 WebElement passwordbox = driver.findElement(By.xpath("(//input[@type='password'])"));
	 passwordbox.sendKeys("Baskaran2&",Keys.ENTER);
	 Thread.sleep(3000);
	 WebElement samsungphone = driver.findElement(By.xpath("//a[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']"));
	 samsungphone.click();
	 
	 String ParentID = driver.getWindowHandle();
	 System.out.println(ParentID);
	 
	 Set<String> allwindows = driver.getWindowHandles();
	 System.out.println(allwindows);
	 for (String string : allwindows) {
		System.out.println(!string.equals(ParentID));
		 if (!string.equals(ParentID)) {
			driver.switchTo().window(string);
		}
	}
	 WebElement imgscreenhot = driver.findElement(By.xpath("(//img[@alt='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)'])[1]"));
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File source = imgscreenhot.getScreenshotAs(OutputType.FILE);
    File dest =new File("D:\\New folder\\Flipkart1.png");
	FileUtils.copyFile(source, dest); 
	boolean canread = dest.canRead();
	System.out.println(canread);
	 
	WebElement source1 = driver.findElement(By.xpath("//span[text()='#JustHere']"));
	WebElement dest1 = driver.findElement(By.name("q"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(source1,dest1);
	
	
	
	
	
	 
}
}
