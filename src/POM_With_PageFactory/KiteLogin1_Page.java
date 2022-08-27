package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1_Page {
	@FindBy(xpath="//input[@id=\"userid\"]")private WebElement UN;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement login;
	
	public KiteLogin1_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String user) {
		UN.sendKeys(user);
	}
	public void enterPass(String pass) {
		pwd.sendKeys(pass);
	}
	public void ClkLogin() {
		login.click();
	}

}
