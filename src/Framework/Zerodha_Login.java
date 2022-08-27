package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zerodha_Login {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\zerodha.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().window().maximize();
	 // enter user name
	String UN = sh.getRow(0).getCell(0).getStringCellValue();	 
	driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(UN);
	//enter password
	String pass=sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
	//click login button
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//enter pin
	String pin=sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	//click continue
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	//verify userId
	String exp=sh.getRow(0).getCell(3).getStringCellValue();
	String act=driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
	if(act.equals(exp)) {
		System.out.println("Text case pass");
	}
	else
	{
		System.out.println("Test case fail");
	}
}
}
