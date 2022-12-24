package TestPack;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.Base_OrangeHrm;
import Pom.Pom_OrangeHrm;
import Utilitypack.Utility_OrangeHrm;

public class Test_OrangeHrm extends Base_OrangeHrm{
	Pom_OrangeHrm po;
	
	@BeforeClass
	public void openBrowser() {
		initialize();
		 po = new Pom_OrangeHrm(driver);
	}
	
	@BeforeMethod
	public void openApp() throws Throwable {
		po.enterUser(Utility_OrangeHrm.putData(0, 0));
		po.enterPass(Utility_OrangeHrm.putData(0, 1));
		po.clicklogin();
	}
	
	@Test
	public void verify() {
		Reporter.log("no verification",true);
	}
}
