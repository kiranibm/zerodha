package AlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("123");
		 driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	Thread.sleep(2000);	 
	Alert alt=driver.switchTo().alert();
	alt.accept();
	//Thread.sleep(3000);
	//alt.dismiss();
	Thread.sleep(4000);
	
	String text=alt.getText();
	System.out.println(text);
	
	alt.dismiss();
	}

}
