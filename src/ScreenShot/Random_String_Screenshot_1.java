package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Random_String_Screenshot_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 JavascriptExecutor jsp=(JavascriptExecutor)driver;
	 jsp.executeScript("window.scrollBy(0,4000)");
	 Thread.sleep(3000);
	 String random=RandomString.make();
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("H:\\JAvaScreenShot\\"+random+".jpg");
	 Files.copy(src, dest);
	 
}
}
