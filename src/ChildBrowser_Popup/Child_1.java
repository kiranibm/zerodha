package ChildBrowser_Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		    Thread.sleep(3000);
		    //driver.findElement(By.xpath("(//a[@class=\"s1Q9rs\"])[1]")).clear();
		   driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		    Thread.sleep(3000);
		    Set<String> allws = driver.getWindowHandles();
		 ArrayList<String> al=new ArrayList<String>(allws);
		   String cw = al.get(1);
		   System.out.println(cw);

	   String mainwin = al.get(0);
		   System.out.println(mainwin);
		   Thread.sleep(3000);
	 driver.switchTo().window(al.get(0));
	      Thread.sleep(3000);
		 driver.switchTo().window(al.get(1));
		 //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
			 
				 
	}

}
