package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel1 {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	
	WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("Naveen53");
	
    WebElement userpassword  = driver.findElement(By.id("password"));
	userpassword.sendKeys("C1IZAU");
	
	WebElement userlogin = driver.findElement(By.id("login"));
	userlogin.click();
	
	WebElement ddnlocation = driver.findElement(By.id("location"));
	Select select = new Select(ddnlocation);
	select.selectByValue("Sydney");
	
	WebElement ddnhotel = driver.findElement(By.id("hotels"));
	Select slthtl = new Select(ddnhotel);
	slthtl.selectByValue("Hotel Sunshine");
	
	WebElement ddnroomselect = driver.findElement(By.id("room_type"));
	Select roomselect = new Select(ddnroomselect);
	roomselect.selectByValue("Super Deluxe");

	WebElement ddnnoofroom = driver.findElement(By.id("room_nos"));
	Select nomem = new Select(ddnnoofroom);
	nomem.selectByIndex(4);
	
	WebElement ddnroomtype = driver.findElement(By.id("adult_room"));
	Select roomtype2 =new Select(ddnroomtype);
	roomtype2.selectByIndex(2);
	
	WebElement searchtext = driver.findElement(By.id("Submit"));
	searchtext.click();
	
	
	WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	radiobtn.click();
	
	WebElement continuebtn = driver.findElement(By.id("continue"));
	continuebtn.click();
	
	WebElement fillbox1 = driver.findElement(By.id("first_name"));
	fillbox1.sendKeys("Baskaran");
	
	WebElement fillbox2 = driver.findElement(By.id("last_name"));
	fillbox2.sendKeys("BOSE");
	
	WebElement fillbox3 = driver.findElement(By.id("address"));
	fillbox3.sendKeys("no. 5 , 5th , street pudhu nagar,medavekkam");
	
	WebElement fillbox4 = driver.findElement(By.id("cc_num"));
	fillbox4.sendKeys("12345678910123456");
	
	WebElement cardtype = driver.findElement(By.id("cc_type"));
	Select cardtype1 = new Select(cardtype);
	cardtype1.selectByIndex(3);
	
	WebElement expdata1 = driver.findElement(By.id("cc_exp_month"));
	Select exp =new Select(expdata1);
	exp.selectByIndex(2);
	
	WebElement expdata2 = driver.findElement(By.id("cc_exp_year"));
	Select exp1 =new Select(expdata2);
	exp1.selectByVisibleText("2022");
	
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("123");
	
	WebElement bookbtn = driver.findElement(By.id("book_now"));
	bookbtn.click();
	Thread.sleep(10000);
	WebElement txtorder = driver.findElement(By.id("order_no"));
	String text = txtorder.getAttribute("value");
	System.out.println(text);
	
	WebElement inktext = driver.findElement(By.xpath("//td[@class='footer']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(true)",inktext );
	WebElement inktext2  = driver.findElement(By.id("username_show"));
	executor.executeScript("arguments[0].scrollIntoView(false)",inktext2 );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
