package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_OrangeHrm {

	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[1]") private WebElement text;

	
	public Pom2_OrangeHrm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifytext(String Text) {
		
	}
	
	
}
