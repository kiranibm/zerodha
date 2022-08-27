package Xpath_Group_By_Index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_By_index_01 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		driver.findElement(By.xpath("(//div)[13]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a)[8]")).click();
		
	}

}
