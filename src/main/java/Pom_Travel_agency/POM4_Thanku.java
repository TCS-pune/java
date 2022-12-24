package Pom_Travel_agency;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class POM4_Thanku {

	@FindBy(xpath="//table[@class='table']//tr[1]//td[2]")private WebElement id;
	
	public POM4_Thanku(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void storeid() throws Throwable {
		/*String ID = id.getText();
		return ID;*/
		
		File src = id.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Ankush\\Documents\\screenshots");
		Files.copy(src, dest);
	}
}
