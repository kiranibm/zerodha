package Image;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class AllImg {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> allImg = driver.findElements(By.tagName("img"));
	System.out.println("Total Image tag"+allImg.size());
	for(WebElement one:allImg) {
		String name=one.getTagName();
		//System.out.println(name);
		
		String ra1 = RandomString.make();
		File src=one.getScreenshotAs(OutputType.FILE);
		File dest=new File("H:\\JAvaScreenShot\\Amazon img\\"+ra1+".png");
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0,5000);");
		
		Files.copy(src, dest);
	}
	}
	}
