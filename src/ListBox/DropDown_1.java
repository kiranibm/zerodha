package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\Admin\\Documents\\select.html");
	//inspect dropdown
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"5 Star\"]"));
	//create object of select class
	Select s=new Select(dropdown);
	
	s.selectByIndex(2);//select by index methods
	s.selectByValue("c");// select by value methods
	
	s.selectByVisibleText("Dosa");// select by visible text
	
	
	
	
	
	}

}
