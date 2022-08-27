package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement userId;
	
public KiteHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifyUSerID() {
	String exp="DPG458";
	String act=userId.getText();
	if(exp.equals(act)) {
		System.out.println("Test case PAss");
	}
	else {
		System.out.println("Test case fail");
	}
}
}
