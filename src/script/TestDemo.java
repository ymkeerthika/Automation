package script;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Result;

public class TestDemo extends BaseTest{
	@Test
	public void testA() {
		Reporter.log("test...",true);
	}
	

}
