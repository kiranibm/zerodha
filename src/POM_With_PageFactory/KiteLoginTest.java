package POM_With_PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\zerodha.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 KiteLogin1_Page login1=new KiteLogin1_Page(driver);
		 String user=sh.getRow(0).getCell(0).getStringCellValue();
		 login1.enterUsername(user);
		 
		 String pass=sh.getRow(0).getCell(1).getStringCellValue();
		 login1.enterPass(pass);
		 
		 login1.ClkLogin();
		 
		 KiteLogin2_Page login2=new KiteLogin2_Page(driver);
		 String pinn=sh.getRow(0).getCell(2).getStringCellValue();
		 login2.enterPin(pinn);
		 login2.click();
		 Thread.sleep(3000);
		 KiteHomePage hm=new KiteHomePage(driver);
		 String userID=sh.getRow(0).getCell(0).getStringCellValue();
		 hm.verifyUserID(userID);
		 driver.close();
	}

}
