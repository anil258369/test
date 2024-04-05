package introduction;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutOverview {
	
	
public WebDriver driver;
	
	
	public checkoutOverview(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(id="finish")
	WebElement finishButton;
	
	public void clickFinish() {
		
		finishButton.click();
	}

}
