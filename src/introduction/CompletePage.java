package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
	
	public WebDriver driver;
	public CompletePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement confirmationText;


	public String confirmationmessage() {
		return confirmationText.getText();
	
		}


	

}
