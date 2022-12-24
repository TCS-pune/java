package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1page {

	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")private WebElement login;
	
	public Pom1page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUser(String user) {
		username.sendKeys(user);
	}
	
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterLogin() {
		login.click();
	}
	
}
