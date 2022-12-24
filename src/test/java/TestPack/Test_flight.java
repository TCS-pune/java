package TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.Base_flight;
import Pom_Travel_agency.POM3_Purchase;
import Pom_Travel_agency.POM2_Purchaseflight;
import Pom_Travel_agency.POM4_Thanku;
import Pom_Travel_agency.POM1_homepage;
import Utilitypack.Utility_flight;

public class Test_flight extends Base_flight{
	
	POM1_homepage hp;
	POM2_Purchaseflight pf;
	POM3_Purchase p;
	POM4_Thanku tu;

	@BeforeClass
	public void openBrowser() throws Throwable {
		initialize();
		Thread.sleep(3000);
		
		 hp = new POM1_homepage(driver);
		 pf = new POM2_Purchaseflight(driver);
		 p = new POM3_Purchase(driver);
		 tu = new POM4_Thanku(driver);
	}
	
	@Test
	public void verifywelcome() throws Throwable {
		String act = hp.verifytitle();
		String exp = Utility_flight.putData(0, 0);
		Assert.assertEquals(act, exp);
		
		hp.clickdest();
	}
	@Test
	public void Url() throws Throwable {
		 driver.getCurrentUrl().contains(Utility_flight.putData(1, 0));
		Thread.sleep(3000);
		driver.navigate().back();
		hp.selectdeparture();
		hp.selectdestination();
		hp.clickflights();
	}
	
	@Test
	public void bookticket() {
		pf.clickonchoose();
	}
}
