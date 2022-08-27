package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_Element_ScreenShot_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 WebElement firstele = driver.findElement(By.xpath("(//img[@class=\"landscape-image\"])[1]"));
	 Thread.sleep(3000);
	 File src=firstele.getScreenshotAs(OutputType.FILE);
			File dest=new File("H:\\JAvaScreenShot\\FirstElement.jpg");
			Files.copy(src, dest);
}
}
