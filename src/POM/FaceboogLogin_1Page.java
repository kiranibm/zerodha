package POM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceboogLogin_1Page {


	@FindBy(xpath="//input[@id=\"email\"]")private WebElement email; 
	@FindBy(xpath="//input[@id=\"pass\"]")private WebElement pass;
	@FindBy(xpath="//button[@name=\"login\"]") private WebElement ClickLogin;
	
	public FaceboogLogin_1Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
			
	public void enterEmail() throws Throwable {
		email.sendKeys("9623089002");
		
	}
	public void enterPass() {
		pass.sendKeys("9623089002SKishu");
	}
	public void clkLogin() {
		ClickLogin.click();
	}
}
