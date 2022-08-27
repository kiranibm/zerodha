package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
@FindBy(xpath="(//span[@class=\"a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7\"])[1]")private WebElement text;

public FacebookHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifyText() {
	String exp="Kiran Sudhir Raykar Kothimbire";
	String act=text.getText();
	if(act.equals(exp)) {
		System.out.println("Test case pass");
	}
	else {
		System.out.println("Test case Fail");
	}
}
}
