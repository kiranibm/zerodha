package Testng_Prog;



import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Disable_TC_Using_Suite {
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3",true);
		//assert(false);
		System.out.println("welcome");
	}

}
