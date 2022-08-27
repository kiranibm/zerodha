package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com/");
}
}
