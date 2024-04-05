package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public WebDriver driver;
	
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@data-test='username']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	
	public void loginApplication(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	
	
	

}
