package Pom_Travel_agency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_Purchaseflight {

	@FindBy(xpath="(//input[@class='btn btn-small'])[3]")private WebElement choose;
	
	public POM2_Purchaseflight (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonchoose() {
		choose.click();
	}
	
	
	
}
