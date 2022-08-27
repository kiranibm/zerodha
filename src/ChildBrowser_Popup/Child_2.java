package ChildBrowser_Popup;

import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_2 {
	//private static final String ArrayList = null;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//click on cancel button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		
		//search mobile
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Dress");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// click on 1st
		driver.findElement(By.xpath("(//img[@class=\"_2r_T1I\"])[2]")).click();
		// by default selenium control  should be on main window we have switch it from main window to child
		
		Set<String> allws = driver.getWindowHandles();
		// use arrylist to store all windows
		ArrayList<String> al = new ArrayList<String>(allws);
		String cw=al.get(1);
		System.out.println(cw);
		
	}

}
