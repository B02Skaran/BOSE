package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/drag_drop.html");
    	driver.manage().window().maximize();
    	WebElement inkcourse = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
    	
    	WebElement disnation = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    	WebElement inksource1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
    	WebElement disnation2 = driver.findElement(By.id("amt7"));
    	
    	
    	WebElement inksource3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
    	WebElement disnation3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
    	
    	
    	WebElement inksource4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
    	
    	WebElement disnation4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
    	
    	Actions actions = new Actions(driver);
    	actions.dragAndDrop(inkcourse,disnation ).perform();
    	actions.dragAndDrop(inksource1, disnation2).perform();
    	actions.dragAndDrop(inksource3, disnation3).perform();
    	actions.dragAndDrop(inksource4, disnation4).perform();
    	
    	
    	WebElement per = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
    	String text = per.getText();
    	System.out.println(text);
    	
	}
	
	
	
	
}
