package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourInformation {
	
public WebDriver driver;
	
	
	public yourInformation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	
	public void fillInformation(String firstname, String lastname, String postalcode) {
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		postalCode.sendKeys(postalcode);
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}

}
