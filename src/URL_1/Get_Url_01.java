package URL_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Url_01 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
	}

}
