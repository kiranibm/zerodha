package Robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_1 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    //use Robot class for scrool down
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(4000);
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);

}
}