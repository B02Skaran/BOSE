package org.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schoolTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	WebElement tabledata = driver.findElement(By.id("customers"));
	List<WebElement> allrows = tabledata.findElements(By.tagName("tr"));
	for (int i = 0; i <allrows.size(); i++) {
		WebElement elel = allrows.get(i);
		List<WebElement> alldatas = elel.findElements(By.tagName("tr"));
		for (int j = 0; j <alldatas.size(); j++) {
			WebElement webelement = alldatas.get(j);
		String text = webelement.getText();
		System.out.println(text);
		
		
	
		
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
