package Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//Enter Un
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		Thread.sleep(3000);
		//Password
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		Thread.sleep(3000);
		// checkBox
		driver.findElement(By.xpath("//label[@id=\"keepLoggedInLabel\"]")).click();
		// Login button
		driver.findElement(By.xpath("//div[text()='Login ' ]")).click();
		
		Thread.sleep(3000);
		
		Thread.sleep(4000);
	}

}
