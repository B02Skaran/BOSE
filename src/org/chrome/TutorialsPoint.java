package org.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsPoint {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");	
WebDriver driver =new ChromeDriver();	
driver.manage().window().maximize();	
driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");	
WebElement ddnskills = driver.findElement(By.name("continents"));
Select select = new Select(ddnskills);	
//get all option in dp by index	
List<WebElement>dDnskills = select.getOptions();
	   for (WebElement webElement : dDnskills) {
		   String text = webElement.getText();
		   select.selectByVisibleText(text);
		   
	}
	
	
}
}
