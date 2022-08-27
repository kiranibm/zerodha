package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin1Page {
	@FindBy(xpath="//input[@id=\"username\"]")private WebElement UN;
	@FindBy(xpath="//input[@name=\"pwd\"]")private WebElement Pass;
	@FindBy(xpath="")private WebElement Clickenter;
	
public ActiTimeLogin1Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUserName() {
	UN.sendKeys("admin");
}
public void enterPass(){
	Pass.sendKeys("manager");
	
}
public void clickEnter() {
	Clickenter.click();
}

}
