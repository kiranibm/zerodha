package Testng_Prog;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_1 {
	@Test(priority=3)
	public void TC() {
		Reporter.log("Running TC",true);
	}
	@Test(enabled=false)
	public void IC() {
		Reporter.log("Running priority 2",true);
	}
	@Test(priority=1)
	public void IC1() {
		Reporter.log("Running Priority 1",true);
	}

}
