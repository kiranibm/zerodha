package AlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups_2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	 driver.findElement(By.xpath("//button[.='Alert Box']")).click();
	 Thread.sleep(3000);
	 Alert alt=driver.switchTo().alert();
	 String text=alt.getText();
	 System.out.println(text);
	 alt.accept();
	 Thread.sleep(4000);
	 // inspect second alert button
	 driver.findElement(By.xpath("//button[.='Confirm Alert Box']")).click();
	 Thread.sleep(3000);
	 Alert alt1=driver.switchTo().alert();
	 String text1=alt1.getText();
	 System.out.println(text1);
	 alt.dismiss();
	 
	 // thrid alert
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
	 Thread.sleep(3000);
	 Alert alt2=driver.switchTo().alert();
	 
	 String text2=alt2.getText();
	 System.out.println(text2);
	 alt2.accept();
	 
	 
	 
}
}
