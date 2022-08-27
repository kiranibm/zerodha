package MultiBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Sample {
	@Parameters("browsername")
	@Test
	public void TC1(String browsername){
		WebDriver driver=null; //runtime polymorphism
if(browsername.equals("Chrome")){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
		}
		else if(browsername.equals("Firfox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		
	}

}
