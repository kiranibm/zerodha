package XPath_By_Contains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_by_Contains_01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//user name
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	
	driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	Thread.sleep(3000);
	String exp="actiTIME - Enter Time-Track";
	String act=driver.getTitle();
	
	if(act.equals(exp)) {
		System.out.println("Test case Pass by contains");
	}
	else {
		System.out.println("Test case Fail");
	}
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[contains(text(),'Users')]")).click();
	Thread.sleep(3000);
	String s1="actiTIME - User List";
	String s2=driver.getTitle();
	if(s1.equals(s2)) {
		System.out.println("Test case pass UserList");
	}
	else {System.out.println("Test case fail UserList");}
	}

}
