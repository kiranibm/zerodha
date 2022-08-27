package NotificationPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popups_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create browser setting class
		ChromeOptions c=new ChromeOptions();
		//call addArguments method of browser setting class
		c.addArguments("--disable-notifications");
		
		//pass the variable in chromedriver constructor
		
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfc.com/");
		
	}

}
