package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {
	@FindBy(xpath="//div[@id=\"logo_aT\"]")private WebElement title;
	 
	public ActitimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyTitle() {
		String exp="";
		String act=title.getText();
		if(act.equals(act)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("TEst case fail");
		}
	}
}
