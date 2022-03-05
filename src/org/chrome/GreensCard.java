package org.chrome;

import java.awt.Desktop.Action;
import java.io.File;
import java.nio.file.Files;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.codec.http.multipart.FileUpload;


public class GreensCard {
       

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
    	   WebDriver driver =new ChromeDriver();
    	   driver.manage().window().maximize();
    	  Thread.sleep(5000);
    	  driver.get("http://greenscart.in/#/login?returnUrl=%2Fproducts%2Fcart-items");
    	 Thread.sleep(3000);
    	  WebElement usernamebox = driver.findElement(By.id("loginEmailId"));
    	  usernamebox.sendKeys("baskaran0202@gmail.com");
    	  WebElement passwordbox = driver.findElement(By.id("loginPassword"));
    	  passwordbox.sendKeys("Baskaran2&");
    	  WebElement loginbtn = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
    	  loginbtn.click();
    	  Thread.sleep(3000);
    	  WebElement seemoretxt = driver.findElement(By.xpath("//a[text()='See More']"));
    	  seemoretxt.click();
    	  WebElement addcart = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
    	  addcart.click();
    	 Thread.sleep(3000 );
    	  WebElement traybtn = driver.findElement(By.xpath("(//a[@class='nav-link'])[8]"));
    	  traybtn.click();
    	  WebElement ADDGIFTCODE = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
    	  ADDGIFTCODE.click();
    	 WebElement doubleclick = driver.findElement(By.xpath("(//span[@class='border border-success px-3 rounded code'])[1]"));
    	 Thread.sleep(20000);
    	 Actions actions =new Actions(driver);
    	 actions.doubleClick().perform();
    	 
    	 
    	 
    	 
    	 
    	  
    	  /* Thread.sleep(15000);
    	  Actions actions = new Actions(driver);
    	  actions.doubleClick().perform();*/
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  /*type  cast
    	   TakesScreenshot screen = (TakesScreenshot)driver;
    	   WebElement username = driver.findElement(By.id("loginform"));
     	  username.sendKeys("Baskaran");
    	   //temporary location (sourse)
    	   File s = screen.getScreenshotAs(OutputType.FILE);
    	   
    	   //destination location
    	   File d = new File("C:\\Users\\ADMIN\\eclipse-workspace\\StringisClass\\string.png");
    	   
    	   //copy file 
    	   
    	   FileUtils.copyFile(s,d);
    	   boolean b = d.isFile();
    	   System.out.println(b);*/
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
