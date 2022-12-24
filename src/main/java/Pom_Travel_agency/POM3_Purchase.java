package Pom_Travel_agency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3_Purchase {

	@FindBy(xpath="//h2[text()='Your flight from TLV to SFO has been reserved.']")private WebElement text;
	@FindBy(xpath="(//div[@class='container'])[2]/descendant::em")private WebElement total;
	@FindBy(xpath="//input[@class='btn btn-primary']")private WebElement clickpurchase;
	
	public POM3_Purchase (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String gettext() {
		String purchase = text.getText();
		return purchase;
	}
	
	/*public void checktotal() {
		total.
	}*/
	
	public void purchase() {
		clickpurchase.click();
	}
}
