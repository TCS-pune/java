package TestPack;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.Base;
import Pom.Pom1page;
import Utilitypack.utility;

public class Test1 extends Base {

	@BeforeClass
	public void initialize() {
		openBrowser();
	}
	
	@BeforeMethod
	public void openapp() throws Throwable, Throwable {
		Pom1page p = new Pom1page(driver);
		p.enterUser(utility.putData(0,0));
		p.enterPass(utility.putData(0,1));
		p.enterLogin();
	}
	
	@Test
	public void verify() {
		Reporter.log("blank", true);
	}
	
	

	
}
