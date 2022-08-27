package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitiLogin_2Page {
	
	@FindBy(xpath="//input[@id=\"pin\"]")private WebElement PIN;
	@FindBy(xpath="//button[@class=\"button-orange wide\"]") private WebElement ClickCtnBtn;
	
	public KitiLogin_2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin() {
		PIN.sendKeys("171992");
	}
	public void clickCtnBtn() {
		ClickCtnBtn.click();
	}
	

}
