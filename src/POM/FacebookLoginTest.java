package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 FaceboogLogin_1Page page1=new FaceboogLogin_1Page(driver);
		 page1.enterEmail();
		 page1.enterPass();
		 page1.clkLogin();
		 FacebookHomePage page2=new FacebookHomePage(driver);
		 page2.verifyText();
		 
	}

}
