package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_methos {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("(//a[text()='Gmail'])"));
		
		// create action class object
		Actions act=new Actions(driver);
		
		// 1) moveToElement
		act.moveToElement(gmail).perform();
		
		//2) RightClick- contextClick()
		//act.moveToElement(gmail).contextClick().perform();
	 
		// 3) LeftClick- click()
		//act.moveToElement(gmail).click().perform();
		
		//4) doubleClick()
		act.moveToElement(gmail).doubleClick().perform();
		
		// how to perform 3 actions in single statement using build()
		act.moveToElement(gmail).contextClick().click().doubleClick().build().perform();
		Thread.sleep(3000);
		
	
	}

}
