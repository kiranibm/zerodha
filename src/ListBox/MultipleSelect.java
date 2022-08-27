package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Admin/Documents/select.html");
      //inspect the dropdown
     WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"5 Star\"]"));
     //object of select class
     
     Select s=new Select(dropdown);
     
     if(s.isMultiple()) {
    	 System.out.println("Given dropdown is Multiselected");
     }
     else {
    	 System.out.println("is not Multiselected ");
     }
     //gel size of all list
     List<WebElement>allelements=s.getOptions();
     System.out.println(allelements.size());
     // get the text of all elements
     
     for(int i=0;i<=allelements.size()-1;i++)
     {
    	 WebElement oneElements=allelements.get(i);
    	 String text=oneElements.getText();
    	 System.out.println(text);
     }
	}

}
