package introduction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationFlow extends Base {
	
	
@Test()
public void checkFlow() {
	
	launchApplication();
	
	// Login page flow 
	loginPage login = new loginPage(driver);
	login.loginApplication("standard_user", "secret_sauce");
	
	//ProductsPage Flow
	productsPage products = new productsPage(driver);
	products.addProduct("Sauce Labs Backpack");
	
	

	products.clickCart();
	
	
	//Cart page Flow
	
	cartPage cart = new cartPage(driver);
	cart.clickCheckout();
	
	//Yourinformationflow
	yourInformation info = new yourInformation(driver);
	info.fillInformation("test", "test", "30022");
	info.clickContinueButton();
	
	//checkoutFlow
	checkoutOverview checkout = new checkoutOverview(driver);
	checkout.clickFinish();
	
	//Completepage Flow
	CompletePage flow = new CompletePage(driver);
	
	Assert.assertEquals(flow.confirmationmessage(), "Thank you for your order!");
	
}

}
