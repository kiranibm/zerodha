package Testng_Prog;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void Open() {
		Reporter.log("Open Browser",true);
	}
	
	@BeforeMethod
	public void LoginApp() {
		Reporter.log("Login to App",true);
	}
	@Test
	public void Verify() {
		Reporter.log("verify userId",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout App",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("Close the browser",true);
	}

}
