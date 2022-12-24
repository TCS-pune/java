package Pom_Travel_agency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM1_homepage {

	@FindBy(xpath="(//div[@class='container'])[2]/descendant::h1") private WebElement text1;
	@FindBy(xpath="//a[text()='destination of the week! The Beach!']") private WebElement text2;
	@FindBy(xpath="(//select[@class='form-inline'])[1]") private WebElement Citysrc;
	@FindBy(xpath="(//select[@class='form-inline'])[2]") private WebElement Citydest;
	@FindBy(xpath="//input[@class='btn btn-primary']") private WebElement findFlights;
	
	public POM1_homepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifytitle() {
		String act = text1.getText();
		return act;
	}
	
	public void clickdest() {
		text2.click();
	}
	
	public void selectdeparture() {
		Select s = new Select(Citydest);
		s.selectByIndex(5);
	}
	
	public void selectdestination() {
		Select s = new Select(Citydest);
		s.selectByIndex(2);
	}
	
	public void clickflights() {
		findFlights.click();
	}
	
}
