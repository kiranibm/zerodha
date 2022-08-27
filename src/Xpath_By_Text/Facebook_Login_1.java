package Xpath_By_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	// User name
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9623089002");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("9623089002skIshu");
	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();	
driver.findElement(By.xpath("(//div)[53]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
}

}
