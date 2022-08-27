package Dynamic_Elements_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Virus_Recover_Case_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/country/uk");
		String recover = driver.findElement(By.xpath("(//div[@class=\"maincounter-number\"]//span)[3]")).getText();
	System.out.println("Recover Cases:"+recover);
	
	String cases= driver.findElement(By.xpath("(//div[@class=\"maincounter-number\"]//span)[1]")).getText();
	System.out.println("Total CoronaVirus Cases:"+cases);
	
	String death=driver.findElement(By.xpath("(//div[@class=\"maincounter-number\"]//span)[2]")).getText();
	System.out.println("Total Death cases:"+death);
	}

}
