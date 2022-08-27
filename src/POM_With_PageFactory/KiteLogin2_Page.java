package POM_With_PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2_Page {
@FindBy(xpath="//input[@id=\"pin\"]")private WebElement PIN;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement clkConti;
public KiteLogin2_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterPin(String pinn) {
	PIN.sendKeys(pinn);
}
public void click() {
	clkConti.click();
}
}
