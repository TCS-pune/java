package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_OrangeHrm {

	@FindBy(xpath="//input[@name='username']") private WebElement Username;
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") private WebElement Login;
	
	public Pom_OrangeHrm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUser(String User) {
		Username.sendKeys(User);
	}
	
	public void enterPass(String Pass) {
		Password.sendKeys(Pass);
	}
	public void clicklogin() {
		Login.click();
	}
}
