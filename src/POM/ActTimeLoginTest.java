package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeLoginTest {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

ActiTimeLogin1Page login=new ActiTimeLogin1Page(driver);
login.enterUserName();
login.enterPass();

ActitimeHomePage test1=new ActitimeHomePage(driver);
test1.verifyTitle();
Thread.sleep(3000);
driver.close();
	}

}
