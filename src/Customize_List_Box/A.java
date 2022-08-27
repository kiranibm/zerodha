package Customize_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		// select list box of month
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,"9623089002",Keys.TAB,"123456789");
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.click(month).perform();
		
		  //move to upside
//		  Thread.sleep(3000);
//		  act.sendKeys(Keys.ARROW_UP).perform();
//          act.sendKeys(Keys.ARROW_UP).perform();
//          act.sendKeys(Keys.ARROW_UP).perform();
//        //move down
    	  Thread.sleep(3000);
//    	  act.sendKeys(Keys.ARROW_DOWN).perform();
    	  //select top most element
    	  act.sendKeys(Keys.HOME).perform();
    	  
    	  act.sendKeys(Keys.ENTER).perform();
    	  Thread.sleep(2000);
    	  WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
    	  act.click(year).perform();
    	  Thread.sleep(2000);
    	  act.sendKeys(Keys.ARROW_DOWN).perform();
    	  act.sendKeys(Keys.ENTER).perform();
	}

	private static CharSequence sendKeys(String string, Keys tab, String string2, Keys tab2, String string3, Keys tab3,
			String string4) {
		// TODO Auto-generated method stub
		return null;
	}

}
