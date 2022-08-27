package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 KiteLogin_1Page login1=new KiteLogin_1Page(driver);
	 login1.EnterUn();
	 login1.EnterPWD();
	 login1.ClickLoginBtn();
	 
	 KitiLogin_2Page login2=new KitiLogin_2Page(driver);
	 login2.enterPin();
	 login2.clickCtnBtn();
	 
	 KiteHomePage hm=new KiteHomePage(driver);
	 hm.verifyUSerID();
	 driver.close();
	 
}
}
