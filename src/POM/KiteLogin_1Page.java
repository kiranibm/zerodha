package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin_1Page {
	@FindBy(xpath="//input[@id=\"userid\"]") private WebElement UN;
	@FindBy(xpath="//input[@id=\"password\"]") private WebElement PWD;
	
	@FindBy(xpath="//button[@class=\"button-orange wide\"]") private WebElement LoginBtn;
	
	public KiteLogin_1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void EnterUn() {
		UN.sendKeys("DPG458");
	}
	public void EnterPWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void ClickLoginBtn() {
		LoginBtn.click();
	}
	

}
