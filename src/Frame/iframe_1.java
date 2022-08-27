package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		// switch to second frame
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Kothimbire");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	}

}
