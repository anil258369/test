package introduction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	
public WebDriver driver;
	
	
	public cartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='cart_item_label']/a")
	List<WebElement> cartProducts;
	
	
	@FindBy(id="checkout")
	WebElement checkoutButton;
	
	
	public void getProductsText(String productname) {
		
		cartProducts.stream().anyMatch(s->s.getText().equalsIgnoreCase(productname));
	}
	
	public void clickCheckout() {
		checkoutButton.click();
	}

}
