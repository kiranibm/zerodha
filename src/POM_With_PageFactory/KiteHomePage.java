package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement text;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyUserID(String expID) {
		String acT=text.getText();
		if(acT.equals(expID)) {
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
	}
}
